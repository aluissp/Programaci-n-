/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Armando Perugachi
 */
public class Main {

    public static void main(String[] args) {
        int[] notas = {2, 3, 4, 6, 7, 1, 10, 9, 8, 4, 3, 7, 8, 6, 9, 10};
        String[] paices = {"Ecuador", "Mexico", "Paraguay", "Brazil", "Colombia", "Chile", "Argentina", "Panama", "Peru"};

        System.out.println("Promedio: " + FuncionesDeArreglos.promedioEnteros(notas) + " Suma: " + FuncionesDeArreglos.suma(notas));
        System.out.println("Valor máximo: " + FuncionesDeArreglos.valorMaximo(notas) + " Valor mínimo: " + FuncionesDeArreglos.valorMinimo(notas));

        System.out.println("\nOrdenamiento de menor a mayor\n");
        FuncionesDeArreglos.OrdenarEnterosAscendente(notas);
        System.out.println(FuncionesDeArreglos.mostrarArreglo(notas));

        System.out.println("\nOrdenamiento de mayor a menor\n");
        FuncionesDeArreglos.OrdenarEnterosDescendente(notas);
        System.out.println(FuncionesDeArreglos.mostrarArreglo(notas));

        System.out.println("\nOrdenamiento de String Ascendente\n ");
        FuncionesDeArreglos.OrdenarStringAscendente(paices);
        System.out.println(FuncionesDeArreglos.mostrarArreglo(paices));

        System.out.println("\nOrdenamiento de String Descendente\n ");
        FuncionesDeArreglos.OrdenarStringDescendente(paices);
        System.out.println(FuncionesDeArreglos.mostrarArreglo(paices));
    }
}
