package Modelo;

public class Clientes {

    private int idClientes;
    private String nombre;
    private String apellido;
    private int cedula;
    private int idPanaderia;

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdPanaderia() {
        return idPanaderia;
    }

    public void setIdPanaderia(int idPanaderia) {
        this.idPanaderia = idPanaderia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
