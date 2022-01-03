package MetodoOrdenamiento;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo;
        int numElementos, aux;

        System.out.println("Digite el numero de elementos");
        numElementos = sc.nextInt();

        arreglo = new int[numElementos];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("\nValor " + (i + 1));
            arreglo[i] = sc.nextInt();
        }

        //Ordenamos el arreglo con metodo burbuja 
        for (int i = 0; i < arreglo.length - 1; i++)
            {
                for (int j = 0; j < arreglo.length - (i+1); j++)
                {
                    if (arreglo[j] > arreglo[j + 1])//Si numeroActual > numeroSiguiente
                    {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }
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
