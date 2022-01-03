package Bloque4;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] serie1 = new int[10];
        int[] serie2 = new int[10];

        System.out.println("Digite 10 valores crecientes");
        System.out.println("Valor 1");
        serie1[0] = sc.nextInt();

        for (int i = 1; i < serie1.length; i++) {
            System.out.println("Valor " + (i + 1));
            serie1[i] = sc.nextInt();

            if (serie1[i - 1] >= serie1[i]) {
                while (serie1[i - 1] >= serie1[i]) {
                    System.out.println("\nDigite un valor mayor");
                    serie1[i] = sc.nextInt();
                }
            }
        }

        System.out.println();
        System.out.println("Digite 10 valores crecientes");
        System.out.println("Valor 1");
        serie2[0] = sc.nextInt();

        for (int i = 1; i < serie2.length; i++) {
            System.out.println("Valor " + (i + 1));
            serie2[i] = sc.nextInt();

            if (serie2[i - 1] >= serie2[i]) {
                while (serie2[i - 1] >= serie2[i]) {
                    System.out.println("\nDigite un valor mayor");
                    serie2[i] = sc.nextInt();
                }
            }
        }

        int[] sumaSeries = new int[20];
        //Agregando a un tercer arreglo
        int i = 0;//Para serie1
        int j = 0;//Para serie2
        int k = 0;//Para serie3

        while (i < serie1.length && j < serie2.length) {
            if (serie1[i] < serie2[j]) {
                sumaSeries[k] = serie1[i];
                i++;
            } else {
                sumaSeries[k] = serie2[j];
                j++;
            }
            k++;
        }//Cuando una de los series termine o se complete terminara el ciclo y pasara a ver la siguiente condicion.

        if (i == 10) {//si se completo la primera serie falta llenar la segunda
            while (j < serie2.length) {
                sumaSeries[k] = serie2[j];
                j++;
                k++;
            }
        } else {//si se llena la segunda, pasa a llenar la primera
            while (i < serie1.length) {
                sumaSeries[k] = serie1[i];
                i++;
                k++;
            }
        }
        System.out.println("Arreglo resultante");
        for (int i1 = 0; i1 < sumaSeries.length; i1++) {
            System.out.print(sumaSeries[i1] + "    ");
        }
    }
}
