
import java.util.Scanner;

public class Tarea48 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Proporcione un valor entre 1-999");
            num = scanner.nextInt();
            if (num >= 100 && num <= 999) {
                System.out.println("El valor " + num + " tiene 3 digitos");
            } else if (num >= 10 && num <= 99) {
                System.out.println("El valor " + num + " tiene 2 digitos");
            } else {
                System.out.println("El valor " + num + " tiene 1 digitos");
            }

        } while (num != 0);

    }
}
