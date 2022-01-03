package Bloque3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite un numero");
        num = sc.nextInt();
        System.out.println();

        while (num >= 0) {
            System.out.println("El cuadrado es " + (num * num) + "\n");
            System.out.println("Digite un numero");
            num = sc.nextInt();
        }
        System.out.println("Ha finalizado el programa");

    }
}
