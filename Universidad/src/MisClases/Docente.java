/** *********************************************************************
 * Module:  Docente.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Docente
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 9ce3a915-3f75-4e43-886d-fc24626bfe28
 */
public class Docente extends Personal implements ICalculos {

    /**
     * @pdOid 03e741dd-9918-46ba-a268-a9895ffda511
     */
    private int horasClase;
    /**
     * @pdOid a345a527-14e3-462b-87ce-e766fe26b5f3
     */
    private int nroMaterias;

    public Docente(String nombre, String dni, String direccion, String telefono,
            String correo, String titulo, Double sueldo, int horasClase, int nroMaterias) {
        super(nombre, dni, direccion, telefono, correo, titulo, sueldo);
        this.horasClase = horasClase;
        this.nroMaterias = nroMaterias;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    /**
     * @return * @pdOid c33b4adf-2aea-46e9-aa4d-3d3184ad5e8f
     */
    public int getNroMaterias() {
        return nroMaterias;
    }

    /**
     * @param newNroMaterias
     * @pdOid 5311fc37-6b22-4c31-b94a-00e599821603
     */
    public void setNroMaterias(int newNroMaterias) {
        nroMaterias = newNroMaterias;
    }

    @Override
    public double iCalculaIESS(double sueldo) {
        return 0;
    }

    /**
     *
     * @param sueldo
     * @return
     */
    @Override
    public double iCalcularSueldo(double sueldo) {
        return 0;
    }

}
