
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class HoraMinutoSegundo {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hora: ");
        int hora = input.nextInt();

        System.out.print("Minuto: ");
        int minuto = input.nextInt();

        System.out.print("Segundos: ");
        int segundos = input.nextInt();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minuto++;
        }

        if (minuto == 60) {
            minuto = 0;
            hora++;
        }

        if (hora == 24) {
            hora = 0;
        }

        System.out.println("Fecha: " + hora + ":" + minuto + ":" + segundos);
    }
}

