/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

/**
 *
 * @author Armando Perugachi
 */
public class AuxFracciones {

    private int numerador;
    private int denominador;

    public AuxFracciones(int numerador, int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            this.denominador = 1;
        }

        this.numerador = numerador;

        if (this.numerador < 0 && this.denominador < 0) {
            this.numerador = Math.abs(this.numerador);
            this.denominador = Math.abs(this.denominador);
        }
    }

    private int MCD(int numerador, int denominador) {
        if (numerador < denominador) {
            int aux = numerador;
            numerador = denominador;
            denominador = aux;
        }
        if (denominador == 0) {
            return numerador;
        } else {
            return MCD(denominador, numerador % denominador);
        }
    }

    public AuxFracciones SimplificarFracciones() {
        int mcd;
        int auxN = this.numerador;
        int auxD = this.denominador;
        int signo = 1;

        if (auxN < 0 || auxD < 0) {
            auxN = Math.abs(auxN);
            auxD = Math.abs(auxD);
            signo = -1;
        }

        mcd = MCD(auxN, auxD);
        auxN /= mcd;
        auxD /= mcd;

        return new AuxFracciones(signo * auxN, auxD);
    }

    public String MostrarFraccion() {
        return this.numerador + "/" + this.denominador;
    }

    public static void main(String[] args) {
        AuxFracciones a = new AuxFracciones(9, 27);
        System.out.println("Fraccion original: " + a.MostrarFraccion());
        System.out.println("La fraccion simplificada es: " + a.SimplificarFracciones().MostrarFraccion());
    }
}
