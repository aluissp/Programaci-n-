/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaExcepciones;

/**
 *
 * @author Armando Perugachi
 */
public class ExcepcionPersonalizada extends Exception {

    public ExcepcionPersonalizada() {
        super("Se ha introducido el numero 0");
    }
}
