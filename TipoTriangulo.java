
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class TipoTriangulo {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado 1: ");
        int lado1 = sc.nextInt();
        System.out.println("Ingrese la longitud del lado 2: ");
        int lado2 = sc.nextInt();
        System.out.println("Ingrese la longitud del lado 3: ");
        int lado3 = sc.nextInt();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triángulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo escaleno");
        }
    }
}

