package Bloque4;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int variable = 0, cont = 0;
        boolean asc = false, des = false, igual = false;

        System.out.println("Digite los valores del arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        //CRECIENTE
        while (cont < numeros.length) {
            if (numeros[cont] > variable) {
                variable = numeros[cont];
                asc = true;
            } else {

                //DECRECIENTE
                cont = numeros.length - 1;
                variable = 0;
                while (cont >= 0) {
                    if (numeros[cont] > variable) {
                        variable = numeros[cont];
                        des = true;
                    } else {

                        //IGUAL
                        cont = 0;
                        variable = numeros[0];
                        while (cont < numeros.length) {
                            if (numeros[cont] == variable) {
                                variable = numeros[cont];
                                igual = true;
                            } else {
                                igual = false;
                                cont = numeros.length - 1;
                            }
                            cont++;
                        }
                        des = false;
                        cont = 0;
                    }
                    cont--;
                }
                asc = false;
                cont = numeros.length - 1;
            }
            cont++;
        }

        if (asc) {
            System.out.println("El arreglo esta en orden creciente");
        } else if (des) {
            System.out.println("El arreglo esta en orden decreciente");
        } else if (igual) {
            System.out.println("Todos los valores del arreglo son iguales");
        } else {
            System.out.println("Los valores del arreglo estan desordenados");
        }
    }
}
