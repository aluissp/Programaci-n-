
import java.util.Scanner;


public class Tarea22 {
    public static void main(String[] args) {
        
        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año");
        int año=scanner.nextInt();
        
        arimetica.bisiesto(año);
    }
}
