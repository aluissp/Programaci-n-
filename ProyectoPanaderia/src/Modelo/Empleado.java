package Modelo;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String contraseña;
    private int cedula;
    private int idPanaderia;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdPanaderia() {
        return idPanaderia;
    }

    public void setIdPanaderia(int idPanaderia) {
        this.idPanaderia = idPanaderia;
    }

}
