
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Multiplo8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 8 == 0) {
            System.out.println(numero + " es múltiplo de 8.");
        } else {
            System.out.println(numero + " no es múltiplo de 8.");
        }
    }
}

