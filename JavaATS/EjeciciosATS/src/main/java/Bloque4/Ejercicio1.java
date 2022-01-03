package Bloque4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Los valores del arreglo son:");
        for (double i : numeros) {
            System.out.println(i);
        }

    }

}
