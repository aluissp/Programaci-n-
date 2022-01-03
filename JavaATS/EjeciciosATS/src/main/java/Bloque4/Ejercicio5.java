package Bloque4;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numA = new int[10];
        int[] numB = new int[10];
        int[] resultado = new int[(numA.length + numB.length)];
        int cont = 0, cont2 = 0;

        System.out.println("Digite los valores para el primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor numero " + (i + 1));
            numA[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Digite los valores para el segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor numero " + (i + 1));
            numB[i] = sc.nextInt();
        }
        System.out.println();

        //Llenando la mezcla del arreglo A y B
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                resultado[i] = numA[cont];
                cont++;
            } else {
                resultado[i] = numB[cont2];
                cont2++;
            }
        }

        System.out.println("La mezcla del arreglo 1 y 2 es: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + "  ");
        }
    }
}
