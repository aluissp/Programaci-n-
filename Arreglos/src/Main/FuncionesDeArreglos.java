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
public class FuncionesDeArreglos {

    public static int suma(int[] n) {
        int suma = 0;

        for (int i = 0; i < n.length; i++) {
            suma += n[i];
        }

        return suma;
    }

    public static double promedioEnteros(int[] n) {
        return (double) suma(n) / n.length;
    }

    public static int valorMinimo(int[] n) {
        int minimo = n[0];

        for (int i = 1; i < n.length; i++) {
            if (minimo > n[i]) {
                minimo = n[i];
            }
        }

        return minimo;
    }

    public static int valorMaximo(int[] n) {
        int maximo = n[0];

        for (int i = 1; i < n.length; i++) {
            if (maximo < n[i]) {
                maximo = n[i];
            }
        }

        return maximo;
    }

    public static void OrdenarEnterosAscendente(int[] n) {
        int aux;

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }

        }
    }

    public static void OrdenarEnterosDescendente(int[] n) {
        int aux;

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] < n[j]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }

        }
    }

    public static void OrdenarStringAscendente(String[] n) {
        String aux;

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i].compareTo(n[j]) > 0) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }
    }

    public static void OrdenarStringDescendente(String[] n) {
        String aux;

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i].compareTo(n[j]) < 0) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }
    }

    public static String mostrarArreglo(int[] n) {
        String r = "";

        for (int i = 0; i < n.length; i++) {
            r += n[i] + "\n";
        }
        return r;
    }

    public static String mostrarArreglo(String[] n) {
        String r = "";

        for (String a : n) {
            r += a + "\n";
        }
        return r;
    }
}
