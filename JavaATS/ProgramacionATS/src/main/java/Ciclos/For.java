package Ciclos;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;
        //Numeros Pares
        System.out.println("Digite un contador");
        contador=sc.nextInt();
        System.out.println();
        
        for (int i = 2; i < contador; i*=2) {
            System.out.println(i);
        }
    }
}
