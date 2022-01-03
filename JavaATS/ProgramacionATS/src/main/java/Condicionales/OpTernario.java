package Condicionales;

import java.util.Scanner;

public class OpTernario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String valor;
        System.out.println("Digite un valor");
        num = sc.nextInt();

        valor = (num % 2 == 0) ? "Es primo":"No es primo";
        
        System.out.println(valor);
    }
}
