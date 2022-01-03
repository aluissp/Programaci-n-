/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arreglos;

/**
 *
 * @author Bryan
 */
public class Cuadrado {

    private Punto vertice;
    private double lado;
    public static int cont=0;

    public Cuadrado() {
        this.lado = 1;
        this.vertice = new Punto(0, 0);
        cont++;
        System.out.println("Cuadrado: "+cont);
    }

    public Cuadrado(double lado, Punto vertice) {
        this.lado = lado;
        this.vertice = vertice;
        cont++;
        System.out.println("Cuadrado: "+cont);
    }

    public Cuadrado(double lado, int x, int y) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }
        this.vertice = new Punto(x, y);
        cont++;
        System.out.println("Cuadrado: "+cont);
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public double getLado() {
        return this.lado;
    }

    public double CalcularArea() {
        return Math.round(this.lado * this.lado * 100.0) / 100.0;
    }

    public double CalcularPerimetro() {
        return 4 * this.lado;
    }

    public Punto getVertice() {
        return this.vertice;
    }

    public void Mover(int dx, int dy) {
        this.vertice.Mover(dx, dy);
    }

    public String Imprimir() {
        return "lado : " + this.lado + " Vértice Inferior Izquierdo: " + this.vertice.Imprimir();
    }
    public void SetX(int x) {
        this.vertice.setX(x);
    }

    public int GetX() {
        return this.vertice.getX();
    }

    public void SetY(int y) {
        this.vertice.setY(y);
    }

    public int GetY() {
        return this.vertice.getY();
    }
    public void SetVertice(int x, int y){
        this.vertice.setX(x);
        this.vertice.setY(y);
    }

}
