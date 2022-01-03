/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraCola;

import EstructuraPila.Pila;

/**
 *
 * @author Armando Perugachi
 */
public class Cola {

    private int tamaño;
    private int nElementos;
    private Object[] v;
    private int inicio, fin;

    public Cola(int tamaño) {
        v = new Object[this.tamaño = tamaño];
        inicio = fin = nElementos = 0;
    }

    public boolean Llena() {
        return (this.nElementos == this.tamaño);
    }

    public boolean Vacia() {
        return (this.nElementos == 0);
    }

    public String Ingresar(Object elemento) {
        if (!Llena()) {
            this.v[fin++] = elemento;
            nElementos++;
            if (fin == tamaño) {
                fin = 0;
            }

            return "Elemento ingresado correctamente";
        } else {
            return "No se pudo ingresar el elemento porque la cola esta llena";
        }
    }

    public Object Retirar() {
        Object aux = null;
        if (!Vacia()) {
            aux = v[inicio++];
            nElementos--;
            if (inicio == tamaño) {
                inicio = 0;
            }
        }
        return aux;
    }

    public int getnElementos() {
        return nElementos;
    }

    public Object Frente() {
        Object aux = null;
        if (!Vacia()) {
            aux = v[inicio];
        }

        return aux;
    }

    public Pila productosAgotandose(Cola productos) {
        Pila aux = new Pila(productos.getnElementos());
        while (!productos.Vacia()) {
            Productos p = (Productos) productos.Retirar();

            if (p.getCantidad() <= p.getMinimo()) {
                aux.Apilar(p);
            }
        }
        return aux;
    }
}
