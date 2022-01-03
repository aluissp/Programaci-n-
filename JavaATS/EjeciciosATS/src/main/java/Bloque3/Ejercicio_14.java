package Bloque3;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo, sumaSueldo = 0;
        int mayor1000 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite el salario " + i);
            sueldo = sc.nextDouble();

            if (sueldo > 1000) {
                mayor1000++;
            }
            sumaSueldo += sueldo;

        }
        System.out.println();

        System.out.println("La suma total de los sueldos es: " + sumaSueldo);
        System.out.println("Hay " + mayor1000 + " sueldos mayores de 1000");
    }
}
