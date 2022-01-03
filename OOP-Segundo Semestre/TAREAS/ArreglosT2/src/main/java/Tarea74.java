
import java.util.Scanner;

public class Tarea74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del arreglo");
        int tam = sc.nextInt();
        char ct;
        do {
            int[] A = new int[tam];
            int[] B = new int[tam];
            int[] C = new int[tam];

            for (int i = 0; i < tam; i++) {
                A[i] = (int) (Math.random() * (100 + 100 + 1) - 100);
                System.out.println(A[i]);
            }
            System.out.println("----------------");
            for (int i = 0; i < B.length; i++) {
                B[i] = (int) (Math.random() * (100 + 100 + 1) - 100);

            }
            System.out.println("1. Llenar el arreglo A de manera aleatoria.");
            System.out.println("2. Llenar el arreglo B de manera aleatoria.");
            System.out.println("3. Realizar C = A + B");
            System.out.println("4. Realizar C = B - A");
            System.out.println("\n Seleccione una opcion");
            int op = sc.nextInt();
            while (op <= 4) {

                if (op ==  1) {
                    for (int i = 0; i < tam; i++) {

                        System.out.println(A[i]);
                    }
                } else if (op == 2) {
                    for (int i = 0; i < B.length; i++) {

                        System.out.println(B[i]);
                    }
                } else if (op == 3) {
                    for (int i = 0; i < C.length; i++) {
                        C[i] = A[i] + B[i];
                        System.out.println(C[i]);
                    }
                } else if (op == 4) {
                    for (int i = 0; i < C.length; i++) {
                        C[i] = A[i] - B[i];
                        System.out.println(C[i]);
                    }
                }
                op++;
            }
            do {
                System.out.println("Desea salir (S/N)");

                ct = sc.next().charAt(0);
            } while (ct != 'S' && ct != 's' && ct != 'N' && ct != 'n');

        } while (ct == 'S' || ct != 's');
        System.out.println("Gracias");
    }
}
