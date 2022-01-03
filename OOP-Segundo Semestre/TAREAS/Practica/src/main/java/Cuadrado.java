
import java.util.Scanner;


public class Cuadrado {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño");
        int num = scanner.nextInt();
        
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {
                System.out.print("@ ");
                
            }
            System.out.println("");
            
        }
        int num2=scanner.nextInt();
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num2; j++) {
                System.out.print("@ ");
                
            }
            System.out.println("");
            
        }
    }
}
