package Bloque2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Proporcione 3 valores");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println();

        if ((num1 < num2) && (num1 < num3)) {
            if ((num2 < num3)) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else if ((num3 < num2)) {
                System.out.println(num2 + " " + num3 + " " + num1);
            }

        } else if ((num2 < num1) && (num2 < num3)) {
            if (num1 < num3) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else if (num3 < num1) {
                System.out.println(num1 + " " + num3 + " " + num2);
            }

        } else if ((num3 < num1) && (num3 < num2)) {
            if ((num2 < num1)) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else if (num1 < num2) {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
        }
    }
}
