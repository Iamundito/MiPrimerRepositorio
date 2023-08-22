
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Redondear {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();
        
        long redondeado = Math.round(numero);
        
        System.out.println("El número redondeado es: " + redondeado);
    }
}

