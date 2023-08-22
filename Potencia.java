
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese la potencia: ");
        double exponente = scanner.nextDouble();
        
        double resultado = Math.pow(base, exponente);
        
        System.out.println(base + " elevado a la potencia " + exponente + " es igual a " + resultado);
        
        scanner.close();
    }
} 

