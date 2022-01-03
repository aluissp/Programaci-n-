package Bloque4;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;

        System.out.println("Digite 5 numeros enteros");
        System.out.println("Valor " + 1);
        numeros[0] = sc.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.println("\nValor " + (i + 1));
            numeros[i] = sc.nextInt();

            if (numeros[i] <= numeros[i - 1]) {
                while (numeros[i] <= numeros[i - 1]) {
                    System.out.println("Digite un valor mayor");
                    numeros[i] = sc.nextInt();
                }
            }
        }

        do {
            System.out.println("\nDigite un numero para insertar");
            num = sc.nextInt();
        } while (num < 1);

        for (int i = 0; i < 5; i++) {
            if (num < numeros[i]) {
                // aux=numeros[i];
                for (int j = numeros.length - 1; j > i; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[i] = num;
                i += 4;
            } else {
                numeros[5] = num;
            }
        }

        System.out.println("\nResultado del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }
    }
}
