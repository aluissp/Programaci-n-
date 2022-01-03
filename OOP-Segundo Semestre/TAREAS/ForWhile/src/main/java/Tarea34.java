
import java.util.Scanner;

public class Tarea34 {

    public static void main(String[] args) {

        // PRIMO SI O NO CON WHILE
        Scanner scanner = new Scanner(System.in);
        int valorNum;
        int numResiduo = 0;
        int suma = 0;
        int contador = 1;
        System.out.println("Ingrese un numero");
        valorNum = scanner.nextInt();
        int salvar1 = valorNum;

        while (contador <= valorNum) {

            contador++;
            if (valorNum % contador == 0) {
                suma = numResiduo + 1;
                numResiduo++;

            }

        }

        if (suma <= 2) {
            System.out.println("Es Primo");
        } else {
            System.out.println("No es primo");
        }
    }

}
