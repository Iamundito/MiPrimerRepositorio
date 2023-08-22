
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Fiebre {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numerof = scanner.nextInt();
        
        if (numerof > 40) {
            System.out.println("El paciente paga funeraria  ");
        } else if (numerof < 35) {
            System.out.println("El paciente esta bien. ");
        } else if (numerof >=36 && numerof <=39);
            System.out.println("Acuda a un medico ");
        }
}
