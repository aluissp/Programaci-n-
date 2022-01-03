package Bloque3;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;

        do {
            System.out.println("Digite un numero para sumar");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("la suma total es: " + suma);
    }
}
