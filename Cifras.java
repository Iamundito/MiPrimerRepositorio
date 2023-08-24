
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Cifras {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int cantidadCifras = contarCifras(numero);
        
        System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");
    }
    
    public static int contarCifras(int numero) {
        int cifras = 0;
        
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                cifras++;
            }
        }
        
        return cifras;
    }
}

