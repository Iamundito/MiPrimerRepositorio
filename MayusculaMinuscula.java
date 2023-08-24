
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class MayusculaMinuscula {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra ingresada está en mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra ingresada está en minúscula.");
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }
    }
}

