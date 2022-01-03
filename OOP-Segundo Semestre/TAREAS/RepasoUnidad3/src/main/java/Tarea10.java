
import java.util.Scanner;


public class Tarea10 {

    public static void main(String[] args) {
        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un numero en binario ");
        int num = scanner.nextInt();
     
        int entero=arimetica.intbABinario(num);
        System.out.println("El valor " + num + " en entero es");
        System.out.println(entero);

        
    }
    
}
