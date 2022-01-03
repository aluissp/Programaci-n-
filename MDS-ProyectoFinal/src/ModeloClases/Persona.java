package ModeloClases;

/**
 * *********************************************************************
 * Module: Persona.java Author: Usuario Purpose: Defines the Class Persona
 * *********************************************************************
 */
import java.sql.Date;

public abstract class Persona {
    
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;
    protected Date fechaNacimiento;
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String newDni) {
        dni = newDni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String newNombre) {
        nombre = newNombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String newApellido) {
        apellido = newApellido;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String newTelefono) {
        telefono = newTelefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String newCorreo) {
        correo = newCorreo;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fecha) {
        fechaNacimiento = Date.valueOf(fecha);
    }
    
}
