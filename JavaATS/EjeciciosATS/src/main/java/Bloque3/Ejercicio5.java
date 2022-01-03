package Bloque3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = -1, contador = 0, aleatorio;

        aleatorio = random.nextInt(100) + 1;

        while (aleatorio != num) {
            System.out.println("Digite un numero");
            num = sc.nextInt();
            System.out.println();

            if (aleatorio > num) {
                System.out.println("Digite un numero mayor");
                System.out.println();
            } else {
                System.out.println("Digite un numero menor");
                System.out.println();
            }
            contador++;
        }
        System.out.println("Felicidades ha acertado, el numero es " + num + " y ha realizado " + contador + " intentos");

    }
}
