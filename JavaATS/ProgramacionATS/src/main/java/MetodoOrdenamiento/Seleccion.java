package MetodoOrdenamiento;

import java.util.Scanner;

public class Seleccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        int elementos, min, aux;

        System.out.println("Digite el numero de elementos");
        elementos = sc.nextInt();

        arreglo = new int[elementos];
        System.out.println("\nRellene los valores en el arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println("Valor " + (i + 1));
            arreglo[i] = sc.nextInt();
        }

        //Ordenamiento por seleccion
        for (int i = 0; i < elementos; i++) {
            min = i;
            for (int j = i + 1; j < elementos; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux=arreglo[i];
            arreglo[i]=arreglo[min];
            arreglo[min]=aux; 
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
