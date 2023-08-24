
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class TresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = sc.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Todos los números son iguales.");
        } else if (numero1 != numero2 && numero2 != numero3 && numero1 != numero3) {
            System.out.println("Todos los números son diferentes.");
        } else {
            System.out.println("Ninguno de los números es igual o diferente.");
        }
    }
}

