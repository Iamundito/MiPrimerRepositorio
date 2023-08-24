
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class NumeroDiaMes {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número del 1 al 12: ");
        int numeroMes = scanner.nextInt();
        
        int numeroDias;
        
    switch (numeroMes) {
        case 2:
            numeroDias = 28;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            numeroDias = 30;
            break;
        default:
            numeroDias = 31;
            break;
    }
        
        System.out.println("El mes tiene " + numeroDias + " días.");
    }
}

