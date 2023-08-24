
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class MayorDeEdadMenorDeEdad {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }
    }
    }
} 

