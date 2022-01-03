
import java.util.Scanner;

public class Tarea46 {

    public static void main(String[] args) {

        System.out.println("Señale el orden");
        Scanner scanner = new Scanner(System.in);
        int orden = scanner.nextInt();
        for (int i = 1; i <= orden; i++) {
            for (int j = i; j <= orden; j++) {
                System.out.print("@");

            }
            System.out.println();
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            
        /*System.out.println("Señale el orden");
        int orden = scanner.nextInt();
        int i = 1;
        while (i <= orden) {
            int j = i;
            while (j <= orden) {
                System.out.print("@");
                j++;
            }
            System.out.println();
            int k = 1;
            while (k <= i) {
                System.out.print(" ");
                k++;
            }
            i++;
        }*/
        }
    }
}