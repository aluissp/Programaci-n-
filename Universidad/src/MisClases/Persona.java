/** *********************************************************************
 * Module:  Persona.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Persona
 ********************************************************************** */
package MisClases;

/**
 * @pdOid a4d4cfce-85b9-4f94-ad0b-6bb050fad0e0
 */
public abstract class Persona {

    /**
     * @pdOid afd96831-8901-4538-a3e9-0f016e6ed0cc
     */
    protected String dni;
    /**
     * @pdOid f8fcc7e7-a65a-4e57-884c-db120ceccd1e
     */
    protected String nombre;
    /**
     * @pdOid a9e2fe5a-2aec-4457-8f71-837efa0587f8
     */
    protected String direccion;
    /**
     * @pdOid eac0a668-0ac0-48f5-94aa-61a1e8daa207
     */
    protected String telefono;
    /**
     * @pdOid 59b6860a-b9fe-4e3e-8c34-57c886e5cabd
     */
    protected String correo;

    public Persona(String nombre, String dni, String direccion, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * @return @pdOid 1235e678-73f0-4e4a-a8ca-26fdbd186fd9
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param newDni
     * @pdOid 86b983c5-7110-4148-96d4-829b0d161c12
     */
    public void setDni(String newDni) {
        dni = newDni;
    }

    /**
     * @return @pdOid cd322003-b710-4faf-9100-1e5e1a5a63f3
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param newNombre
     * @pdOid b016db27-c8a3-48f4-8364-5380a7c80361
     */
    public void setNombre(String newNombre) {
        nombre = newNombre;
    }

    /**
     * @return @pdOid 0c4a1d47-24a4-4770-8c8b-927da3062334
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param newDireccion
     * @pdOid 6e9046b1-8305-47e1-9b1b-d71fdcec5be2
     */
    public void setDireccion(String newDireccion) {
        direccion = newDireccion;
    }

    /**
     * @return @pdOid 8f0de77a-745e-4122-9fee-94588e06f620
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param newTelefono
     * @pdOid 740970f2-37ff-4e48-a9fe-c5cc2c02174b
     */
    public void setTelefono(String newTelefono) {
        telefono = newTelefono;
    }

    /**
     * @return @pdOid 275f3e32-87cd-4910-8323-df55942f0d8e
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param newCorreo
     * @pdOid ac98c46f-62b9-4e79-9fb7-957d8c4f8375
     */
    public void setCorreo(String newCorreo) {
        correo = newCorreo;
    }

}
