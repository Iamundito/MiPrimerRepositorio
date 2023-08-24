
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class coltisTechnology {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Valor de compra: ");
        double purchaseAmount = scanner.nextDouble();
        
        double discount = 0;
        if (purchaseAmount > 300) {
            discount = purchaseAmount * 0.2;
        }
        
        double totalAmount = purchaseAmount - discount;
        
        System.out.println("El descuento es de: " + discount);
        System.out.println("El total a pagar es: " + totalAmount);
    }
    }
}

