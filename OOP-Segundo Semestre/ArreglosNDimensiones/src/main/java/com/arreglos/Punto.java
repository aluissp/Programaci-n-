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
public class Punto {

    private int x;
    private int y;
    public static int cont = 0;

    public Punto() {
        this.x = 0;
        this.y = 0;
        cont++;
        System.out.println("Punto: "+cont);
    }
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        cont++;
        System.out.println("Punto: "+cont);
    }

    public void setX(int X) {
        this.x = X;
    }

    public void setY(int Y) {
        this.y = Y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String Imprimir() {
        return "(" + this.x + "," + this.y + ")";
    }

    public void Mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
