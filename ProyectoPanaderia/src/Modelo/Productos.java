
package Modelo;

public class Productos {

    private int idProductos;
    private String nombre;
    private double precio;
    private int cantidad;
    private int idPanaderia;

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdPanaderia() {
        return idPanaderia;
    }

    public void setIdPanaderia(int idPanaderia) {
        this.idPanaderia = idPanaderia;
    }

}
