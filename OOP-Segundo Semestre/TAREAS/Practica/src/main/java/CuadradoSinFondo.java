
import java.util.Scanner;

public class CuadradoSinFondo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño");
        int num = scanner.nextInt();

        //Parte Superior
        for (int ini = 1; ini <= num; ini++) {

            System.out.print("@ ");

        }
        System.out.println("");
        // Centro
        for (int ini = 1; ini <= num - 2; ini++) {
            System.out.print("@ ");
            for (int fin = 1; fin <= num - 2; fin++) {
                System.out.print("  ");
            }
            System.out.println("@ ");

        }

        // Parte inferior
        for (int ini = 1; ini <= num; ini++) {

            System.out.print("@ ");

        }

    }
}
