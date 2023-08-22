
import java.util.Scanner;



/**
 *
 * @author Juan Esteban Sepulveda
 */
public class Login {
public static void main(String[] args) {
        // Definir usuario y contraseña válidos
        String usuarioValido = "Juan";
        String contrasenaValida = "Sepulveda";

        // Solicitar usuario y contraseña al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar si el usuario y contraseña coinciden
        if (usuario.equals(usuarioValido) && contrasena.equals(contrasenaValida)) {
            System.out.println("¡Bienvenido!");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}

