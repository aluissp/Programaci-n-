package Bloque1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        //El cuadrado de una suma
        Scanner sc = new Scanner(System.in);
        double a, b, resultado;

        System.out.println("Ingrese a");
        a = sc.nextDouble();
        System.out.println("Ingrese b");
        b = sc.nextDouble();

        resultado = (a * a) + (Math.pow(b, 2)) + (2 * a * b);
        System.out.println("\nEl cuadrado de la suma es: " + resultado);
    }
}
