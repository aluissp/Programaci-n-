
public class Tarea29 {

    public static void main(String[] args) {

        // FACTORIAL CON WHILE
        int numFactorial = 7;
        int num = 2;
        int numMax=numFactorial;

        System.out.println("El factorial " + numFactorial + " es:");
        while (num < numMax) {
            numFactorial = numFactorial * num;
            num++;
        }
        System.out.println(numFactorial);

        //FACTORIAL CON FOR
        /*int numFactorial = 9;
        int num = numFactorial;

        System.out.println("El factorial "+num+" es:");
        for (int contador = 2; contador < num; contador++) {
            numFactorial = numFactorial * contador;

        }
        System.out.println(numFactorial);*/
    }
}
