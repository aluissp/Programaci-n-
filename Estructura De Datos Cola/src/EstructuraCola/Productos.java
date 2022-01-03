/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraCola;

/**
 *
 * @author Armando Perugachi
 */
public class Productos {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private int minimo;

    public Productos(String codigo, String nombre, int cantidad, double precio, int minimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.minimo = minimo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ",     Nombre: " + nombre + ",     Cantidad: " + cantidad
                + ",        Precio: " + precio + ",     Mínimo: " + minimo;
    }

}
