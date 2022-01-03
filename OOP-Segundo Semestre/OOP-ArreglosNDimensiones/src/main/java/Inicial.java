/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MacArthur
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Arreglo de objetos
        Object[] fig;
        fig = new Object[9];

        Punto pt = new Punto();
        Object obj1;
        obj1 = new Recta(2, 3, 6, 7);

        System.out.println("Recta: " + ((Recta) obj1).Imprimir());

        fig[0] = new Punto();
        fig[1] = new Circunferencia(5, 2, 3);
        fig[2] = new Fecha();
        /*for (int i = 0; i < fig.length; i++) {

            if (fig[i] == pt) {
                pt = (Punto) fig[i];
                System.out.println(pt.Imprimir());
            }
            System.out.println();
        }*/
        //System.out.println(fig);
    }

}
