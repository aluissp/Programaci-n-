package Condicionales;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite un valor entre 1-3");
        valor = sc.nextInt();

        switch (valor) {
            case 1:
                System.out.println("El valor es 1");
                break;
            case 2:
                System.out.println("El valor es 2");
                break;
            case 3:
                System.out.println("El valor es 3");
                break;
            default:
                System.out.println("El valor es diferente de 1-3");

        }
        System.out.println("hola");
    }

}
