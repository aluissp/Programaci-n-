package Busquedas;

import java.util.Scanner;

public class Secuencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {1, 5, 2, 4, 3};
        int dato;
        boolean band = false;

        System.out.println("Digite el valor a bucar");
        dato = sc.nextInt();

        //Busqueda secuencial
        int i = 0;
        while (i < 5 && band == false) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }

        if (band == false) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor a sido encontrado en la posicion " + i);
        }
    }
}
