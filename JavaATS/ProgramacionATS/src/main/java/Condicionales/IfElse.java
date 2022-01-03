package Condicionales;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite el numero 1");
        num = sc.nextInt();

        if (num == 1) {
            System.out.println("El valor es 1");

        } else {
            System.out.println("El valor no es 1");
        }

    }
}
