
import java.util.Scanner;

public class Tarea44 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Señale el orden");
        int numOrden = scanner.nextInt();
        int inicia = 1;

        while (inicia <= numOrden) {

            int fin = inicia;

            while (fin >= 1) {
                System.out.print(inicia);
                fin--;

            }
            System.out.println("");
            inicia++;
        }
        
        System.out.println();


        /*System.out.println("Señale el orden");
        int numOrden = scanner.nextInt();
        int inicia=numOrden;

        for ( inicia = 1; inicia <= numOrden; inicia++) {

            for (int fin = inicia; fin >= 1; fin--) {
                System.out.print(inicia);

            }
            System.out.println("");

        }*/
    }
}
