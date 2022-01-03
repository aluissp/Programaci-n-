package Bloque4;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int valor, cont = 0;

        System.out.println("Digite 10 valores crecientes");
        System.out.println("Valor 1");
        numeros[0] = sc.nextInt();
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Valor " + (1 + i));
            numeros[i] = sc.nextInt();

            if (numeros[i] <= numeros[i - 1]) {
                System.out.println("\nDigite un valor mayor");
                numeros[i] = sc.nextInt();
            }
        }

        System.out.println("\nDigite el valor que desea buscar");
        valor = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (valor == numeros[i]) {
                cont = i + 1;
                i = numeros.length - 1;
            } 
        }

        if (cont == 0) {
            System.out.println("\nEl valor " + valor + " no se encontro");
        } else {
            System.out.println("\nEl valor " + valor + " se encuentra en la posicion " + cont);
        }
    }
}
