
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class VerificarCaracter {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        if (caracter >= 48 && caracter <= 57) {
            System.out.println("Es un dígito");
        } else if (caracter >= 65 && caracter <= 90) {
            System.out.println("Es una letra mayúscula");
        } else if (caracter >= 97 && caracter <= 122) {
            System.out.println("Es una letra minúscula");
        } else {
            System.out.println("No es un dígito, ni letra mayúscula, ni letra minúscula");
        }
    }
}

