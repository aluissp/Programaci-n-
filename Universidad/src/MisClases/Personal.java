/** *********************************************************************
 * Module:  Personal.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Personal
 ********************************************************************** */
package MisClases;

/**
 * @pdOid f3b329bd-a251-4611-a1f9-710c04e4eced
 */
public abstract class Personal extends Persona {

    /**
     * @pdOid 22f33ef8-410d-44ac-9f6f-7a1722e58be8
     */
    protected String titulo;
    /**
     * @pdOid a4937129-3e46-421f-825f-a62c28edd273
     */
    protected Double sueldo;

    public Personal(String nombre, String dni, String direccion, String telefono, String correo, String titulo, Double sueldo) {
        super(nombre, dni, direccion, telefono, correo);
        this.titulo = titulo;
        this.sueldo = sueldo;
    }

    /**
     * @return @pdOid 9765bf09-5b86-42dd-896d-14df26b78f4c
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param newTitulo
     * @pdOid 2db761c9-b546-46b3-9adf-a8470ed4b45e
     */
    public void setTitulo(String newTitulo) {
        titulo = newTitulo;
    }

    /**
     * @return @pdOid d039d30b-b528-4b93-9f82-9f32f3c21ef2
     */
    public Double getSueldo() {
        return sueldo;
    }

    /**
     * @param newSueldo
     * @pdOid af780646-6bff-4057-b4bb-a8f6b3580aa3
     */
    public void setSueldo(Double newSueldo) {
        sueldo = newSueldo;
    }

}
