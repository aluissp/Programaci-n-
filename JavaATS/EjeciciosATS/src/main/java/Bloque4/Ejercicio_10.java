package Bloque4;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int auxFin, posicion = 0;

        System.out.println("Digite 10 valores enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        while (posicion <= 0 || posicion > numeros.length) {
            System.out.println("\nDigite el numeros de posicion a desplazar");
            posicion = sc.nextInt();

            if (posicion <= 0 || posicion > numeros.length) {
                System.out.println("\nDigite una posicion entre 1 y " + numeros.length);
            }
        }

        for (int i = 0; i < posicion; i++) {
            auxFin = numeros[numeros.length - 1];
            for (int j = numeros.length - 2; j >= 0; j--) {
                numeros[j + 1] = numeros[j];
            }
            numeros[0] = auxFin;
        }

        System.out.println("\nArreglo resultante");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
    }
}
