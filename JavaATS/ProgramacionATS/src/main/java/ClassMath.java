
import java.util.Random;

public class ClassMath {

    public static void main(String[] args) {

        //RAIZ
        double raiz = Math.sqrt(81);
        System.out.println(raiz);
        System.out.println();

        //POTENCIA 
        int potencia = (int) Math.pow(5, 2);
        System.out.println(potencia);
        System.out.println();

        //REDONDEO
        double num = 7.398545;
        long resultado = Math.round(num);
        float num1 = 8.888f;
        long valor = Math.round(num1);
        System.out.println();
        System.out.println(resultado);
        System.out.println(valor);
        System.out.println();

        //NUMEROS ALEATORIOS
        int aleatorio = (int) (Math.random() * 6);
        System.out.println(aleatorio);
        System.out.println();

        Random rd = new Random();
        int val = rd.nextInt(10)+1;
        System.out.println(val);
    }
}
