/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Armando Perugachi
 */
public class Circunferencia extends FigurasGeometricas implements Imprimible {

    private int radio;

    public Circunferencia(int radio, Punto punto) {
        super(punto);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public int Area() {
        return (int) (2 * this.radio * Math.sqrt(Math.PI));
    }

    @Override
    public int Perimetro() {
        return (int) (this.radio * 2 * Math.PI);
    }

    @Override
    public String Imprimir() {
        return "Radio: " + this.radio
                + "\nPunto: " + super.getPunto().Imprimir();
    }
}
