
import java.util.Scanner;

public class Tarea23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dia1, mes1, año1;
        int dia2, mes2, año2;
        int dias1, dias2;

        System.out.println("Fecha 1:");
        System.out.println("Introduzca día: ");
        dia1 = scanner.nextInt();
        System.out.println("Introduzca mes: ");
        mes1 = scanner.nextInt();
        System.out.println("Introduzca año: ");
        año1 = scanner.nextInt();
        System.out.println("Fecha 2:");
        System.out.println("Introduzca día: ");
        dia2 = scanner.nextInt();
        System.out.println("Introduzca mes: ");
        mes2 = scanner.nextInt();
        System.out.println("Introduzca año: ");
        año2 = scanner.nextInt();

        dias1 = dia1 + 30 * mes1 + 365 * año1;
        dias2 = dia2 + 30 * mes2 + 365 * año2;

        if (dias1 > dias2) {
            System.out.println("La fecha 1 es mayor que la fecha 2");
        } else if (dias1 < dias2) {
            System.out.println("La fecha 1 es menor que la fecha 2");

        }else{
            System.out.println("La fecha 1 es igual a la fecha 2");
        }

    }

}
