
import java.util.Scanner;

public class Tarea9 {

    public static void main(String[] args) {

        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero mayor o igual a 0 ");
        int num = scanner.nextInt();
     
        int bin=arimetica.binario(num);
        System.out.println("El valor " + num + " en binario es");
        System.out.println(bin);

        /*System.out.println("Introduce un numero entero mayor o igual a 0 ");
        int num = scanner.nextInt();
        int residuo = 0;
        int bin=0;
        int exp=0;
        System.out.println("El valor " + num + " en binario es");
        while (num != 0) {
            residuo = num % 2;
            bin = bin + residuo * arimetica.potencia(10, exp);
            exp++;
            num/= 2;

        }
        System.out.println(bin);*/

    }

}
