
import java.util.Scanner;

public class Tarea43 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dimencion fila x columna");
        int filas = scanner.nextInt();
        int inicia;
        int colum = filas;

        for (inicia = 1; inicia <= filas; inicia++) {
            int fin = inicia;
            for (fin = inicia; fin <= colum; fin++) {
                System.out.print("@ ");

            }
            System.out.println("");

        }

        /*System.out.println("Ingrese dimencion fila x columna");
        int filas = scanner.nextInt();
        int inicia = 1;
        int colum = filas;

        while (inicia <= filas) {
            int fin = inicia;
            while (fin <= colum) {
                System.out.print("@ ");
                fin++;
            }
            inicia++;
            System.out.println("");
                    
        }*/
    }
}
