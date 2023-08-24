
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class MasaCorporal {
public static void main(String[] args) {
        // Pedir al usuario que ingrese el peso en kilogramos y la altura en metros
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el estado en función del IMC
        System.out.println("Su índice de masa corporal (IMC) es: " + imc);
        if (imc < 18.5) {
            System.out.println("Estado: Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Estado: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Estado: Sobrepeso");
        } else {
            System.out.println("Estado: Obesidad");
        }
    }
}   

