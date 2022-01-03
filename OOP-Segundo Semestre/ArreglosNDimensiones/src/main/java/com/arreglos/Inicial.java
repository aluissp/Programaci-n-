/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arreglos;

/**
 *
 * @author MacArthur
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fecha[] fechaA;

        fechaA = new Fecha[5];

        fechaA[0] = new Fecha();
        fechaA[2] = new Fecha(11, 12, 1973);
        fechaA[4] = new Fecha(1, 1, 2000);

        for (int i = 0; i < fechaA.length; i++) {
            if (fechaA[i] != null) {
                System.out.println(i + ".- " + fechaA[i].Imprimir());
            }
//            else
//                i = fechaA.length;
        }

        //Arreglo de objetos
        Object[] fig;
        fig = new Object[9];

        Punto pt = new Punto();
        Object obj1;
        obj1 = new Recta(2, 3, 6, 7);

        fig[0] = new Punto();
        fig[1] = new Circunferencia(5, 2, 3);
        for (int i = 0; i < fig.length; i++) {

            if (fig[i] == pt) {
                pt = (Punto) fig[i];
                System.out.println(pt.Imprimir());
            }
            System.out.println();
        }
        //System.out.println(fig);
    }

}
