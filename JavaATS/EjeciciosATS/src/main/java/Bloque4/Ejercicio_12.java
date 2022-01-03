package Bloque4;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int posicion;

        System.out.println("Digite 10 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        do {
            System.out.println("\nDigite una posicion entre 1-10");
            posicion = sc.nextInt();
        } while (posicion < 1 || posicion > 10);

        posicion--;

        for (int i = 0; i < numeros.length; i++) {
            if (posicion == i) {
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
                numeros[numeros.length - 1] = 0;
                i = numeros.length - 1;
            }
        }

        System.out.println("\nResultado del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
    }
}
