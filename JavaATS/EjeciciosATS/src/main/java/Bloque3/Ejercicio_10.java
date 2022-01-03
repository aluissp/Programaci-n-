package Bloque3;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite el numero " + i);
            num = sc.nextInt();
            suma += num;

        }
        System.out.println();

        System.out.println("La suma total es: " + suma);
    }
}
