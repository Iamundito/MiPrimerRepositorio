

/**
 *
 * @author USUARIO
 */
public class Calificaciones {
public static void main(String[] args) {
        double examen1 = 10;
        double examen2 = 4.2;
        double examen3 = 2.1;
        double trabajo = 1;
        
        double media = (examen1 + examen2 + examen3) / 3; // Calcula la media de los exámenes
        media += trabajo; // Añade 1 punto por el trabajo
        
        System.out.println("La media del estudiante es: " + media);
        System.out.println("La nota final del estudiante es: " + Math.round(media));
    }
}

