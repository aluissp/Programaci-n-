package Bloque3;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sueldo = 0, sueldoMax = 0;
        System.out.println("Digite la cantidad de sueldos");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite el suedo " + i);
            sueldo = sc.nextDouble();

            // 120 540 240
            if (sueldo > sueldoMax) {
                sueldoMax = sueldo;//540
            }
        }
        System.out.println("El sueldo maximo es: " + sueldoMax);
    }

}
