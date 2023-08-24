
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Suma {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = input.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("El resultado de la suma es: " + resultado);
    }
}

