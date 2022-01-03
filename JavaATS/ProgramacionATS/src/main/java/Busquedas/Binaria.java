package Busquedas;

import java.util.Scanner;

public class Binaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1, 2, 4, 5, 6};
        int dato, inf, sup, mitad, i;
        boolean band = false;

        System.out.println("Digite el dato a buscar");
        dato = sc.nextInt();

        //Busqueda binaria
        inf = 0;
        sup = numeros.length - 1;
        i = 0;

        mitad = (inf + sup) / 2;
        System.out.println("Valor mitad: " + mitad);

        while (inf <= sup) {
            if (numeros[mitad] == dato) {
                band = true;
                break;
            } else if (numeros[mitad] > dato) {
                sup = mitad - 1;
            } else if (numeros[mitad] < dato) {
                inf = mitad + 1;
            }
            mitad = (inf + sup) / 2;
        }

        if (band == false) {
            System.out.println("El valor no se encuentra en el arreglo");
        } else {
            System.out.println("El valor a sido encontrado en la posicion " + (mitad + 1));
        }
    }
}
