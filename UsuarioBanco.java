

/**
 *
 * @author USUARIO
 */
public class UsuarioBanco {
public static void main(String[] args) {
        double sueldo = 1000000.0;
        double gasto1 = 400000.0;
        double gasto2 = 215000.0;
        double gasto3 = 51000.0;
        
        double saldoFinal = sueldo - (gasto1 + gasto2 + gasto3);
        
        System.out.println("El saldo final del usuario es: " + saldoFinal + " pesos.");
    }
}

