package Bloque3;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        boolean suspenso = false;

        for (int i = 1; i <= 5; i++) {
            do {
                System.out.println("Digite la calificacion "+i);
                nota = sc.nextInt();
            } while (nota < 0 || nota > 10);

            if (nota < 5) {
                suspenso = true;
            }
        }
        if (suspenso == true) {
            System.out.println("Por lo menos hay un suspenso");
        } else {
            System.out.println("No hay suspenso");
        }
    }
}
