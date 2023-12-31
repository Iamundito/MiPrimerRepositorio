
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class SignoZodiacal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa tu mes de nacimiento (en número): ");
        int mes = scanner.nextInt();

        String signo = obtenerSignoZodiacal(dia, mes);
        System.out.println("Tu signo zodiacal es: " + signo);
    }

    public static String obtenerSignoZodiacal(int dia, int mes) {
        String signo = "";

        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            signo = "Aries";
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
            signo = "Tauro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            signo = "Géminis";
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            signo = "Cáncer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            signo = "Leo";
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            signo = "Virgo";
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            signo = "Libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            signo = "Escorpio";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            signo = "Sagitario";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            signo = "Capricornio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            signo = "Acuario";
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            signo = "Piscis";
        }

        return signo;
    }
}

