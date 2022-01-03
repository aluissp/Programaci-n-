/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraLista;

/**
 *
 * @author Armando Perugachi
 */
public class ListaCircular {

    private Nodo ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    public String ingresarElemento(Object elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.setSiguiente(nuevo);
        } else {
            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

        return "Se ha ingresado correctamente el elemento";
    }

    public int getNumeroNodos() {
        int n = 0;
        if (ultimo != null) {
            Nodo inicio = ultimo.getSiguiente();
            n++;
            while (inicio != ultimo) {
                inicio = inicio.getSiguiente();
                n++;
            }
        }
        return n;
    }

    public Object retirarPrimerNodo() {
        Nodo inicio = ultimo.getSiguiente();
        Object primer = inicio.getInformacion();
        if (inicio.getSiguiente() != null) {
            inicio = inicio.getSiguiente();
        } else {
            ultimo = null;
        }
        return primer;
    }

    public int nroNodos(Nodo p) {
        int n = 0;
        if (p != null) {
            Nodo aux = p.getSiguiente();
            while (aux != p) {
                aux = p.getSiguiente();
                n++;
            }
        }

        return n;
    }

    public boolean listaVacia() {
        return ultimo == null;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

}
