
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class NumeroMayor {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        int numeroMayor = obtenerNumeroMayor(numero1, numero2, numero3);

        System.out.println("El número más grande es: " + numeroMayor);
    }

    public static int obtenerNumeroMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }
}

