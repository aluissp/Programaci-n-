
import java.util.Scanner;

public class Tarea45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Señale el orden");
        int numOrden = scanner.nextInt();

        for (int inicia = 1; inicia <= numOrden; inicia++) {

            for (int fin = 1; fin <= inicia; fin++) {
                System.out.print(fin);

            }
            System.out.println("");  
        }

        /*System.out.println("Señale el orden");
        int numOrden = scanner.nextInt();
        int inicia = 1;

        while (inicia <= numOrden) {

            int fin = 1;

            while (fin <= inicia) {
                System.out.print(fin);
                fin++;

            }
            System.out.println("");
            inicia++;
        }*/
    }

}
