
import java.util.Scanner;

public class MultiplosPrueba {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char ct;
        do {
            
            int min = 0;
            int max = 0;
            
            System.out.println("Ingrese el valor minimo");
            min = sc.nextInt();
            System.out.println("Ingrese el valor maximo");
            max = sc.nextInt();
            
            int cont = 0;
            int cont2 = 0;
            if (min < max) {
                System.out.println("Ingresa el multiplo");
                int multi = sc.nextInt();
                
                System.out.println("Los submultiplos son: ");
                for (int i = min; i <= max; i++) {
                    
                    if (i % multi == 0) {
                        System.out.println(i);
                        cont = cont + 1;
                        
                    }
                    
                }
                System.out.println("La cantidad de multiplos son: \n" + cont);
                
                System.out.println("Los que no tienen submultiplos son: ");
                for (int i = min; i <= max; i++) {
                    
                    if (i % multi != 0) {
                        System.out.println(i);
                        cont2 = cont2 + 1;
                    }
                }
                System.out.println("la cantidad");
                
                System.out.println(cont2);
                
            } else {
                System.out.println("Valores incorrectos");
            }
            do {
                System.out.println("Desea salir (S/N)");
                
                ct = sc.next().charAt(0);
            } while (ct != 'S' && ct != 's' && ct != 'N' && ct != 'n');
           
            
        } while (ct == 'S' || ct != 's');
        System.out.println("Gracias");
    }
}
