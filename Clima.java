
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Clima {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperatura;

        System.out.print("Ingrese la temperatura: ");
        temperatura = input.nextInt();

        if (temperatura <= 10) {
            System.out.println("Frio");
        } else if (temperatura > 10 && temperatura <= 20) {
            System.out.println("Nublado");
        } else if (temperatura > 20 && temperatura <= 30) {
            System.out.println("Caluroso");
        } else {
            System.out.println("Tropical");
        }
    }
}  

