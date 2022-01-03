
import java.util.Scanner;

public class Tarea5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] valor = new int[10];

        System.out.println("Ingresa los valores aleatoriamente");
        for (int i = 0; i < 10; i++) {
            System.out.println("valor " + (i + 1));
            valor[i] = scanner.nextInt();
        }
        System.out.println("Pocicion par");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(valor[i]);
            }
        }
        System.out.println("Pocicion impar");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(valor[i]);
            }
        }
    }
}
