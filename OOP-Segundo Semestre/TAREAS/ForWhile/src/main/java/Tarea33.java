
public class Tarea33 {
    
    public static void main(String[] args) {
        // FIBONACCI CON WHILE
        int num1 = 1;
        int num2 = 1;
        int numMaximo = 20;
        int contador=1;

        System.out.println("La serie de fibonacci hasta el rango 20 son:");

        System.out.println("0");
        System.out.println(num1);

        while (contador<=numMaximo) {
            contador++;
            System.out.println(num2);
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
    }
}
