
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Notas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota (0-10): ");
        int nota = scanner.nextInt();
        
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Por favor, ingrese una nota válida del 0 al 10.");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 7) {
            System.out.println("Suficiente");
        } else if (nota < 9) {
            System.out.println("Bien");
        } else if (nota < 10) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}

