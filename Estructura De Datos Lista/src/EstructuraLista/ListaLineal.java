/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraLista;

import EstructuraLista.Productos;

/**
 *
 * @author Armando Perugachi
 */
public class ListaLineal {

    private Nodo inicio;
    private Nodo ultimo;

    public ListaLineal() {
        this.inicio = null;
    }

    public String ingresarInicio(Object elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        return "Se ha ingresado correctamente el elemento al inicio";
    }

    public String ingresarFinal(Object elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        return "Se ha ingresado correctamente el elemento al final";
    }

    public String ingresarPrueba(Object elemento) {
        if (inicio == null) {
            return ingresarInicio(elemento);
        } else {
            Nodo nuevo = new Nodo(elemento);
            Nodo aux = inicio;
            double precioElemento = ((Productos) nuevo.getInformacion()).getPrecio();
            double precioNodo = ((Productos) aux.getInformacion()).getPrecio();
            double precioNodoSiguiente;
            if (precioNodo < precioElemento) {
                ingresarInicio(elemento);
            } else if (precioNodo > precioElemento && aux.getSiguiente() == null) {
                ingresarFinal(elemento);
            } else if (precioNodo > precioElemento && aux.getSiguiente() != null) {
                while (nuevo != null && aux != null) {
                    precioNodo = ((Productos) aux.getInformacion()).getPrecio();
                    precioNodoSiguiente = ((Productos) aux.getSiguiente().getInformacion()).getPrecio();

                    if (precioNodo > precioElemento && precioElemento > precioNodoSiguiente) {
                        Nodo nSiguiente = aux.getSiguiente();
                        aux.setSiguiente(nuevo);
                        nuevo.setSiguiente(nSiguiente);
                        nuevo = null;
                        aux = null;
                    } else if (precioNodo > precioElemento && aux.getSiguiente().getSiguiente() == null) {
                        ingresarFinal(elemento);
                        nuevo = null;
                        aux = null;
                    } else {
                        aux = aux.getSiguiente();
                    }
                }
            }
        }
        return "Se ha ingresado correctamente el elemento";
    }

    public int getNumeroNodos() {
        int n = 0;
        Nodo aux = inicio;
        while (aux != null) {
            aux = aux.getSiguiente();
            n++;
        }
        return n;
    }

    public Object retirarPrimerNodo() {
        Object primer = inicio.getInformacion();
        if (inicio.getSiguiente() != null) {
            inicio = inicio.getSiguiente();
        } else {
            inicio = null;
            ultimo = null;
        }
        return primer;
    }

    public boolean listaVacia() {
        return inicio == null && ultimo == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

}
