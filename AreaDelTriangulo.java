
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class AreaDelTriangulo {
public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        // Pedir al usuario que ingrese la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área del triángulo utilizando la fórmula: área = (base * altura) / 2
        double area = (base * altura) / 2;

        // Imprimir el resultado
        System.out.println("El área del triángulo es: " + area);
    }
}

