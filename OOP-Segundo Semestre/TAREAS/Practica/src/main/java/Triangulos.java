
import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño");
        int num = scanner.nextInt();

        //Triangulo 1
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------");

        //Triangulo 2
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");

        //Piramide
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("@ ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
        //Piramide 2
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }
            System.out.print("@ ");

            for (int j = 0; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            if (i > 0) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
        for (int i = 0; i < num * 2 + 1; i++) {
            System.out.print("@ ");

        }
        System.out.println("");

        System.out.println("-------------------------");
        //Piramide abajo
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = num; j > i; j--) {
                System.out.print("@ ");
            }
            for (int j = num - 1; j > i; j--) {
                System.out.print("8 ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------");
        //Rombo
        for (int i = 0; i < num - 1; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("  ");
            }
            System.out.print("@ ");

            for (int j = 0; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            if (i > 0) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j <= i+1; j++) {
                System.out.print("  ");
            }

            System.out.print("@");

            for (int j = num - (i * 2); j >= 0; j--) {
                System.out.print("  ");
            }

            if (i < num-2) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}
