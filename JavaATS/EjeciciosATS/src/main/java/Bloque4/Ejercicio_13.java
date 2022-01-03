package Bloque4;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares, impares;
        int cont = 0, cont2 = 0;

        System.out.println("Digite 10 valores");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + (i + 1));
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                cont++;
            } else {
                cont2++;
            }
        }

        //Arreglo para valores pares e impares
        pares = new int[cont];
        impares = new int[cont2];
        System.out.println("\nEspacio de arreglo 1 y 2: " + cont + " - " + cont2);

        cont = 0;
        cont2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[cont] = numeros[i];
                cont++;
            } else {
                impares[cont2] = numeros[i];
                cont2++;
            }
        }
        System.out.println("\nNumeros pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + "  ");
        }

        System.out.println("\nNumeros impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + "  ");
        }
    }

}
