package Bloque3;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean numNegativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite el numero " + i);
            num = sc.nextInt();
            if (num < 0) {
                numNegativo = true;
            }
        }
        if (numNegativo == true) {
            System.out.println("Por lo menos hay un numero negativo");
        } else {
            System.out.println("No hay numeros negativo");
        }
    }
}
