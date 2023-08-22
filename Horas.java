
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Horas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número total de horas: ");
        int horasTotales = scanner.nextInt();
        
        int semanas = horasTotales / 168; // 1 semana tiene 168 horas
        int dias = (horasTotales % 168) / 24; // 1 día tiene 24 horas
        int horas = (horasTotales % 168) % 24;
        
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
    }
}

