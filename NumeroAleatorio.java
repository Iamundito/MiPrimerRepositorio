
import java.util.Random;


/**
 *
 * @author USUARIO
 */
public class NumeroAleatorio {
 public static void main(String[] args) {
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número aleatorio entre 0 y 100
        int numeroAleatorio = random.nextInt(101);

        // Imprimir el número aleatorio generado
        System.out.println("El número aleatorio generado es: " + numeroAleatorio);
    }
}

