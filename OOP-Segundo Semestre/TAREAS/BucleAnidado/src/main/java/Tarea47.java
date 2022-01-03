
import java.util.Scanner;

public class Tarea47 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca numero de filas: ");
        int numFilas = scanner.nextInt();
        int num = 0, numarrob = (numFilas * 2) - 1;

        while (numarrob > 0) {

            int ini = 0;
            while (ini < num) {
                System.out.print(" ");
                ini++;
            }

            int fin = numarrob;
            while (fin > 0) {
                System.out.print("@ ");
                fin++;
            }
            System.out.println();

            num++;
            numarrob -= 2;
        }

        /*System.out.println("Introduzca numero de filas: ");
        int numFilas = scanner.nextInt();
        
        for (int num = 0, numarrob = (numFilas * 2) - 1; numarrob > 0; num++, numarrob -= 2) {


            for (int i = 0; i < num; i++) {
                System.out.print(" ");
            }

            for (int j = numarrob; j > 0; j--) {
                System.out.print("@ ");
            }
            System.out.println();
        }*/
    }
}
