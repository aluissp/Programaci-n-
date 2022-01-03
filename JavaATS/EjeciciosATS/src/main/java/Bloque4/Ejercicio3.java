package Bloque4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        double mediaPositivos = 0, mediaNegativos = 0, sumaPositivos = 0, sumaNegativos = 0;
        int contCero = 0, contPositivos = 0, contNegativos = 0;

        System.out.println("Guardando los valores en el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite un numero");
            numeros[i] = sc.nextDouble();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contPositivos++;

            } else if (numeros[i] < 0) {
                sumaNegativos = numeros[i];
                contNegativos++;

            } else {
                contCero++;
            }
        }
        System.out.println();

        //Media Positivos
        if (contPositivos == 0) {
            System.out.println("No se puede sacar la media de los positivos");
        } else {
            mediaPositivos = sumaPositivos / contPositivos;
            System.out.println("La media de los numeros positivos es: " + mediaPositivos);
        }

        //Media Negativos
        if (contNegativos == 0) {
            System.out.println("No se puede sacar la media de los negativos");
        } else {
            mediaNegativos = sumaNegativos / contNegativos;
            System.out.println("La media de los numeros negativos es: " + mediaNegativos);
        }

        System.out.println("La cantidad de ceros son: " + contCero);
    }
}
