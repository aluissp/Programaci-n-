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
public class Nodo {

    private Object informacion;
    private Nodo siguiente;

    public Nodo(Object informacion) {
        this.informacion = informacion;
        this.siguiente = null;
    }
    
    

    public Object getInformacion() {
        return informacion;
    }

    public void setInformacion(Object informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
