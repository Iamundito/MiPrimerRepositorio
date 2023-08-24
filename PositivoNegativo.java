
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class PositivoNegativo {
public static void main(String[] args) {
    // Solicitar al usuario que ingrese un número
    try ( // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in)) {
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        // Verificar si el número es positivo o negativo
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        // Cerrar el objeto Scanner
    }
    }
}

