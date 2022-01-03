package MetodoOrdenamiento;

import java.util.Scanner;

public class Insercion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        int elementos, pos, aux;
        System.out.println("Digite el numero de elementos");
        elementos = sc.nextInt();

        arreglo = new int[elementos];

        System.out.println("Digite los valores del arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println("Valor " + (i + 1));
            arreglo[i] = sc.nextInt();
        }

        //Ordenamiento por insercion
        for (int i = 0; i < elementos; i++) {
            pos = i;          //Salvamos la posicion y el valord del arreglo
            aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos - 1] > aux)) {   //Hace la comparacion con todos los valores de la izquierda
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            //Ubica el valor puesto a comparar en la posicion correspondiente
            arreglo[pos] = aux;
        }

        //Arreglo ordenado crecientemente
        System.out.println("\nArreglo ordenado crecientemente");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "  ");
        }

        System.out.println("\nArreglo ordenado de forma decreciente");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + "  ");
        }
    }
}
