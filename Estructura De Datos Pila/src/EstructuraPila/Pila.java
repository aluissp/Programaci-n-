/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPila;

/**
 *
 * @author Armando Perugachi
 */
public class Pila {

    private int tamaño;
    private int nElementos;
    private Object[] v;

    public Pila(int tamaño) {
        if (tamaño < 0) {
            tamaño = -1 * tamaño;
        }

        this.tamaño = tamaño;
        nElementos = 0;
        v = new Object[tamaño];
    }

    public String Apilar(Object n) {
        String r = "Elemento apilado correctamente";
        if (Llena()) {
            r = "La pila se encuentra llena, no se puede apilar el elemento";
        } else {
            this.v[nElementos++] = n;
        }

        return r;
    }

    public Object Desapilar() {
        Object aux = null;
        if (!Vacia()) {
            aux = v[--nElementos];
            v[nElementos] = null;
        }
        return aux;
    }

    public boolean Vacia() {
        return (nElementos < 1);
    }

    public boolean Llena() {
        return (this.nElementos == this.tamaño);
    }

    public Object Cima() {
        if (!Vacia()) {
            return v[nElementos - 1];
        } else {
            return null;
        }
    }

    public int getnElementos() {
        return nElementos;
    }

}
