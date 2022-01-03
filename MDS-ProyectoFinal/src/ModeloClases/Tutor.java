package ModeloClases;

/**
 * *********************************************************************
 * Module: Tutor.java Author: Usuario Purpose: Defines the Class Tutor
 * *********************************************************************
 */
public class Tutor extends Persona {

    private String parentesco;

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String newParentesco) {
        parentesco = newParentesco;
    }

    @Override
    public String toString() {
        return "\nDNI: " + super.dni
                + "\nNombre: " + super.nombre
                + "\nApellido: " + super.apellido
                + "\nParentesco: " + parentesco;
    }

}
