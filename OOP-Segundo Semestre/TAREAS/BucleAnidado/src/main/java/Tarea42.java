
import java.util.Scanner;

public class Tarea42 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ladoxlado;
        int fila = 1;
        int colum;
      

        System.out.println("Porfavor proporcione las dimenciones del cuadrado");
        ladoxlado = scanner.nextInt();

        while (fila <= ladoxlado) {
            colum=1;
            while (colum <= ladoxlado) {
                System.out.print("@ ");
                colum++;
            }
            System.out.println("");
            fila++;
        }

        /*int ladoxlado;
        int fila; 
        int colum;
        
        System.out.println("Porfavor proporcione las dimenciones del cuadrado");
        ladoxlado = scanner.nextInt();
        
        for (fila = 1; fila <= ladoxlado; fila++) {
            for (colum = 1; colum <= ladoxlado; colum++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }*/
    }

}
