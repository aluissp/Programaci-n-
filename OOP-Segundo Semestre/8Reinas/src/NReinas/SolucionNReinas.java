/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NReinas;

/**
 *
 * @author Armando Perugachi
 */
public class SolucionNReinas {

    private int[] solucion;
    private int n;

    public SolucionNReinas(int[] solucion, int n) {
        this.solucion = solucion;
        this.n = n;
    }

    public int[] getSolucion() {
        return solucion;
}

    @Override
    public String toString() {
        return "Solucion " + n;
    }

    public String mostrarSolucion() {
        int valorAscci = 65;
        String s = "";
        for (int i = 0; i < solucion.length; i++) {
            s += "(" + Character.toString(valorAscci) + ", " + (solucion[i] + 1) + ")\n";
            valorAscci++;
        }
        return s;
    }

}
