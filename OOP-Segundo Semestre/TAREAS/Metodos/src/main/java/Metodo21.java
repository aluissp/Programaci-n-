
import java.util.Scanner;


public class Metodo21 {

    
    public static void main(String[] args) {

        //Realizar métodos para cotizar el dólar uno en pesos colombianos y otro método en euros.
        Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor en dolar");
        double valorDolar=scanner.nextInt();
        
        double conversionPeso=arimetica.pesoColombiano(valorDolar);
        
        System.out.println(valorDolar+" Dolares "+"equivale a: "+conversionPeso+" Pesos");
        
        /*Arimetica arimetica = new Arimetica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor en dolar");
        double valorDolar=scanner.nextInt();
        
        double conversionEuro=arimetica.euro(valorDolar);
        
        System.out.println(valorDolar+" Dolares "+"equivale a: "+conversionEuro+" Euros");*/
        
    }
    

}
