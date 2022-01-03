package Bloque4;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int num, posicion;

        System.out.println("Digite 8 valores enteros");
        for (int i = 0; i < numeros.length - 2; i++) {
            System.out.println("Valor " + (1 + i));
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nDigite un numero");
        num = sc.nextInt();

        do {
            System.out.println("\nDigite una posicion entre 2-8");
            posicion = sc.nextInt();
        } while (posicion < 2 && posicion > 8);

        posicion--;

        for (int i = numeros.length - 2; i >= posicion; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[posicion] = num;

        System.out.println("\nResultado del arreglo");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
    }
}
