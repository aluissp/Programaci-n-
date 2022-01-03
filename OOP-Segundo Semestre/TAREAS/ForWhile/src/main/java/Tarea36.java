
import java.util.Scanner;

public class Tarea36 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char x = 'A';
        char y = 'a';

        System.out.println("Las letras mayusculas del alfabeto son:");
        while (x <= 'Z') {
            System.out.println(x);
            x++;
        }
        System.out.println("Las letras minusculas del alfabeto son:");
        while (y <= 'z') {
            System.out.println(y);
            y++;
        }
    }

}
