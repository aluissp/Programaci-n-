/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author Luis Perugachi
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEjercicio 10\n");
        int[] num = new int[4];
        System.out.println("Ingrese el primer número:");
        num[0] = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        num[1] = sc.nextInt();
        System.out.println("Ingrese el tercer número:");
        num[2] = sc.nextInt();
        System.out.println("Ingrese el cuarto número:");
        num[3] = sc.nextInt();
        
        burbuja(num);
        System.out.println("\nNumeros ordenados ascendentemente: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        
        System.out.println("\nNumeros ordenados descendentemente: ");
        for (int i = num.length-1; i>=0 ; i--) {
            System.out.print(num[i]+" ");
        }
    }

    public static void burbuja(int[] matrix) {
        int temp;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
    }
}
