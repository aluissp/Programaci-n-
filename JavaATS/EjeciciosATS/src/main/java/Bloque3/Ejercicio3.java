package Bloque3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite un numero");
        num = sc.nextInt();
        System.out.println();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero " + num + " es impar");
            }
            System.out.println();
            System.out.println("Digite otro numero");
            num = sc.nextInt();
            System.out.println();
        }
    }
}
