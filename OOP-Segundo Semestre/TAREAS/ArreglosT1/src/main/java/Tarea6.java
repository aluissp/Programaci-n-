
import java.util.Scanner;

public class Tarea6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numElementos = 0;
        System.out.println("Digite el numero de elementos que va introducir");
        numElementos = scanner.nextInt();
        int[] valores = new int[numElementos];

        System.out.println("Ingresa los valores aleatoriamente");
        for (int i = 0; i < numElementos; i++) {
            System.out.println("valor " + (i + 1));
            valores[i] = scanner.nextInt();

        }
        int contrep = 0;

        for (int i = 0; i < numElementos; i++) {

            for (int j = numElementos; j >= 0; j--) {

                int fin = numElementos - 1;

                if (valores[i] == valores[fin]) {
                    contrep++;
                    break;
                }

                fin--;
            }
        }

        System.out.println("Los valores son");

        for (int i = 0; i < numElementos; i++) {

            if (contrep <1) {

                System.out.println(valores[i]);
            } else {
                System.out.println(" repetidos \n FIN");break;
            }
        }

    }
}
