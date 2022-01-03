package Bloque4;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int auxFin;

        System.out.println("Digite 10 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        auxFin = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = auxFin;

        System.out.println("\nResultado del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
    }
}
