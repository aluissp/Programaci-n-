package Bloque1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, resultado1, resultado2;

        System.out.println("Ingrese el coeficiente a de su ecuacion");
        a = sc.nextDouble();
        System.out.println("Ingrese el coeficiente b de su ecuacion");
        b = sc.nextDouble();
        System.out.println("Ingrese el coeficiente c de su ecuacion");
        c = sc.nextDouble();

        resultado1 = (-b + Math.sqrt((b * b - (4 * a * c)))) / (2 * a);
        resultado2 = (-b - Math.sqrt((b * b - (4 * a * c)))) / (2 * a);

        System.out.println("La primera raiz es: " + resultado1);
        System.out.println("La segunda raiz es : " + resultado2);
    }
}
