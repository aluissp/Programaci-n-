package Bloque2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite un numero entre 0-99999");
        num = sc.nextInt();

        if (num >= 0 && num < 10) {
            System.out.println("El valor tiene una cifra");
        } else if (num >= 10 && num < 100) {
            System.out.println("El valor tiene dos cifras ");
        } else if (num >= 100 && num < 1000) {
            System.out.println("El valor tiene tres cifras");
        } else if (num >= 1000 && num < 10000) {
            System.out.println("El valor tiene cuatro cifras");
        } else if (num >= 10000 && num < 100000) {
            System.out.println("El valor tiene cinco cifras");
        }

    }
}
