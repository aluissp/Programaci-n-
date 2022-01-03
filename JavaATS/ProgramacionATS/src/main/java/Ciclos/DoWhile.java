package Ciclos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite la cantidad de terminos");
        contador = sc.nextInt();

        do {
            System.out.println(i);
            i += 2;
        } while (i <= contador);

    }
}
