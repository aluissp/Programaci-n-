
import java.util.Scanner;

public class Tarea57 {

    public static void main(String[] args) {

        int[] A = {2, 8, 15, 3, 22, 14, 5, 6, 7};

        int[] par; // = {2, 8, 22, 14, 6};

        int[] impar; // = {15, 3, 5, 7};

        int contPar;
        int contImpar;

        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        par = new int[contPar];
        impar = new int[contImpar];

        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                par[contPar] = A[i];
                contPar++;
            } else {
                impar[contImpar] = A[i];
                contImpar++;
            }
        }
        System.out.println("Tabla par:");
        for (int i = 0; i < contPar; i++) {
            System.out.println(par[i]);
        }

        System.out.println("Tabla impar:");
        for (int i = 0; i < contImpar; i++) {
            System.out.println(impar[i]);
        }

    }
}
