package Recursividad;

public class Ordenamiento {

    public static void QuickSort(int[] A, int izquierda, int derecha) {

        int pivote = A[izquierda];
        int i = izquierda;//Iteraciones
        int j = derecha;
        int auxIntercambio;
        while (i < j) {

            //Hacemos la busqueda del valor menor y mayor con el pivote
            //Izquierda
            while (A[i] <= pivote && i < j) {
                i++;
            }
            //Derecha
            while (A[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = A[i];
                A[i] = A[j];
                A[j] = auxIntercambio;
            }
        }

        //Hacemos intercambio del pivote
        A[izquierda] = A[j];
        A[j] = pivote;
        
        for (int ie = 0; ie < A.length; ie++) {
            System.out.print(A[ie] + "  ");
        }
        
        System.out.println("\n");
        if (izquierda < j - 1) {
            QuickSort(A, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(A, j + 1, derecha);
        }
    }
}
