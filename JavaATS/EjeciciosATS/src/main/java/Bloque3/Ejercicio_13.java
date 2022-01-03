package Bloque3;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, positivo = 0, negativo = 0, cont = 0, cont2 = 0, cont3 = 0;
        double media1 = 0, media2 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite el numero " + i);
            num = sc.nextInt();

            if (num > 0) {
                cont++;
                positivo += num;

            } else if (num < 0) {
                cont2++;
                negativo += num;

            } else {
                cont3++;
            }

        }
        System.out.println();

        if (cont == 0) {
            System.out.println("No se puede calcular la media de lo numeros positivos");
        } else {
            media1 = (double) positivo / cont;
            System.out.println("La media de numeros positivos es: " + media1);
        }

        if (cont2 == 0) {
            System.out.println("No se puede calcular la media de los numeros negativos");
        } else {
            media2 = (double) negativo / cont2;
            System.out.println("La media de numeros negativos es: " + media2);
        }

        System.out.println("La cantidad de ceros son: " + cont3);
    }
}
