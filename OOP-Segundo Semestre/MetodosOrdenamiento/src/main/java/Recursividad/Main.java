package Recursividad;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] datos = {2,4,12,1,3,9};
        int busqueda;
        //LlenarArreglo(datos);
        Ordenamiento.QuickSort(datos, 0, datos.length-1);
        System.out.println("\n\n");
        ImprimirArreglo(datos);


        /*//Busqueda con recursividad
        busqueda=BusquedaBinaria.Buscar(datos,0,datos.length-1,33);
        System.out.println("El valor esta en la posicion: "+busqueda);
        System.out.println("\n\n");

        //Recursividad con factorial
        int num=5;
        int repuesta=Aritmetica.Factorial(num);
        System.out.println("El factorial es: "+repuesta);
        
        //Recursividad con Potencia
        int resp=Aritmetica.Potencia(3, 3);
        System.out.println("La potencia en: "+resp);
        
        //Recursividad numero primo
        System.out.println("el numero es: "+Aritmetica.numeroPrimo(12));
        
        
        
        ArrayList<String> textos=new ArrayList<>();
        textos.add("Hola");
        textos.add("Libro");
        textos.add("Perro");
        textos.add("Carro");
        
        for (int i = textos.size()-1; i >= 0; i--) {
            System.out.println((i+1)+".- "+textos.get(i));
        }*/
    }

    public static void ImprimirArreglo(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public static void LlenarArreglo(int[] A) {
        Random r = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(100) + 1;
        }
    }
}
