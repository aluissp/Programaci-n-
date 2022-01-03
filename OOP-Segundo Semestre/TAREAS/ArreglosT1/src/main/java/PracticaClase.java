
import java.util.Scanner;

public class PracticaClase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numElementos = 0;
        System.out.println("Digite el numero de elementos que va introducir");
        numElementos = scanner.nextInt();
        int[] valores = new int[numElementos];

        System.out.println("ingrese los valores");
        for (int i = 0; i < numElementos; i++) {
            valores[i] = scanner.nextInt();
        }

        int max = 0;
        int min = 0;
        for (int i = 0; i < numElementos; i++) {
            for (int j = numElementos - 1; j >= 0; j--) {
                if (valores[i] > valores[j]) {
                    max = valores[i];
                } else if (valores[i] < valores[j]) {
                    min = valores[i];
                }
            }
        }

        System.out.println(".................");
        System.out.println(max);
        System.out.println(min);
    }
}
