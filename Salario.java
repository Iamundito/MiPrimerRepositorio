
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Salario {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 17) {
            System.out.println("No puede trabajar.");
            System.exit(0);
        }
        
        System.out.print("Ingrese su salario: ");
        double salario = scanner.nextDouble();
        
        if (edad >= 18 && edad <= 50) {
            salario *= 1.05; // Aumento del 5%
        } else if (edad >= 51 && edad <= 60) {
            salario *= 1.1; // Aumento del 10%
        } else if (edad > 60) {
            salario *= 1.15; // Aumento del 15%
        }
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario actualizado: " + salario);
    }
}

