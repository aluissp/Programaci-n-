
public class Tarea31 {
    
    public static void main(String[] args) {
        
        //POTENCIAS EN UN RANGO CON WHILE
        int inicioNumero = 2;
        int numMaximo=5;
        int contador=1;
        int resultado;

        System.out.println("La potencias al cuadrado de "+inicioNumero+" hasta "+numMaximo+" son:");
        while (contador<numMaximo) {
            resultado = inicioNumero * inicioNumero;
            System.out.println(resultado);
            contador++;
            inicioNumero++;
        }
        
        /*int inicioNumero = 2;
        int numMaximo=5;
        int contador;
        int resultado;

        System.out.println("La potencias al cuadrado de "+inicioNumero+" hasta"+numMaximo+" son:");
        for (contador = inicioNumero; contador <= numMaximo; contador++) {
            resultado = inicioNumero * inicioNumero;
            System.out.println(resultado);
            inicioNumero++;
        }*/

    }
}
