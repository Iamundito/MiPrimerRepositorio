
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class OrdenCrecienteDescendiente {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Orden: creciente");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Orden: decreciente");
        } else {
            System.out.println("Orden: ni creciente ni decreciente");
        }
    }
}

