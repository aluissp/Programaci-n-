package Bloque4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 numeros para guardarlos");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "Digite un numero");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Los valores del arreglo son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Pocision " + (i + 1) + " numero: " + numeros[i]);
            System.out.println();
            System.out.println("Pocision " + (9 - i) + " numero: " + numeros[9 - i]);
            System.out.println();
        }
    }

}
