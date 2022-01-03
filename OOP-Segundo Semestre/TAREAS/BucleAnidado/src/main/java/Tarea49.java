
import java.util.Scanner;

public class Tarea49 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNotas;
        int numAlumno = 0;
        int numAlumno2 = 0;

        do {
            System.out.println("Poprocione la nota");
            nNotas = scanner.nextInt();

            if (nNotas >= 7) {
                numAlumno++;
            } else if (nNotas > 0) {
                numAlumno2++;
            }
        } while (nNotas != 0);

        System.out.println("Los alumnos con notas mayor o igual a siete son: " + numAlumno);
        System.out.println("Los alumnos con notas menor a siete son: " + numAlumno2);
    }
}
