
import java.util.Scanner;


public class Tarea7 {

    public static void main(String[] args) {

        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Define la fila");
        int fila=scanner.nextInt();
        System.out.println("Define la columna");
        int columna=scanner.nextInt();
        
        arimetica.tabPitagoras(fila, columna);
      
    }
}
