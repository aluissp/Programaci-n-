/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraArbol;

/**
 *
 * @author Armando Perugachi
 */
public class NodoABB {

    private Object Informacion;
    private NodoABB HDerecho;
    private NodoABB HIzquierdo;

    public NodoABB(Object Informacion) {
        this.Informacion = Informacion;
        this.HDerecho = this.HIzquierdo = null;
    }

    public Object getInformacion() {
        return Informacion;
    }

    public void setInformacion(Object Informacion) {
        this.Informacion = Informacion;
    }

    public NodoABB getHDerecho() {
        return HDerecho;
    }

    public void setHDerecho(NodoABB HDerecho) {
        this.HDerecho = HDerecho;
    }

    public NodoABB getHIzquierdo() {
        return HIzquierdo;
    }

    public void setHIzquierdo(NodoABB HIzquierdo) {
        this.HIzquierdo = HIzquierdo;
    }

}
