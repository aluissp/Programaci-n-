package Bloque3;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resultado;

        do {
            System.out.println("Digite un numero");
            num = sc.nextInt();
        } while (num < 0 || num > 10);
        
        System.out.println();

        for (int i = 0; i < 13; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
