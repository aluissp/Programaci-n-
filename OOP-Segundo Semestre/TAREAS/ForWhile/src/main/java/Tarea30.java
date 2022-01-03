
public class Tarea30 {

    public static void main(String[] args) {

        // EJERCICIO CON WHILE
        int numero = 2;
        int exponente = 5;
        int contador=1;
        int numExponente=exponente;
        int resultado=1;
        
        System.out.println("La potencia de "+numero +" elevado a "+exponente+" es:");
        while (contador<=numExponente) {
            resultado = resultado * numero;
            contador++;
        }
        System.out.println(resultado);
        
        //POTENCIA CON FOR
        /*int numero = 2;
        int exponente = 5;
        int contador;
        int resultado=1;
        
        System.out.println("La potencia de "+numero +" es:");
        for (contador = 1; contador <= exponente; contador++) {
            resultado = resultado * numero;
        }
        System.out.println(resultado);*/
    }

}
