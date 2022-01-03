/** *********************************************************************
 * Module:  Administrativo.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Administrativo
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 249a74c0-7dc6-43c0-b2ed-d39143a6d506
 */
public class Administrativo extends Personal implements ICalculos {

    /**
     * @pdOid a38f3cc1-d47d-4cdc-bb0b-8dd8d23fffbd
     */
    private String cargo;
    /**
     * @pdOid 53f360a6-a5fe-4291-b03a-5d451f0f9273
     */
    private int anoIngreso;

    public Administrativo(String nombre, String dni, String direccion, String telefono,
            String correo, String titulo, Double sueldo, String cargo, int anoIngreso) {
        super(nombre, dni, direccion, telefono, correo, titulo, sueldo);
        this.cargo = cargo;
        this.anoIngreso = anoIngreso;
    }


    /**
     * @return @pdOid 168b3b69-539f-4138-b888-a167cc0ed2f5
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param newCargo
     * @pdOid 7ef33600-ea89-41c0-bfba-0b4fdb52cdb9
     */
    public void setCargo(String newCargo) {
        cargo = newCargo;
    }

    /**
     * @return @pdOid 362d5a5c-ec3c-43c2-85dd-057edc86849c
     */
    public int getAnoIngreso() {
        return anoIngreso;
    }

    /**
     * @param newAnoIngreso
     * @pdOid 36f968e1-57e0-4a16-871a-a8d40c6909cf
     */
    public void setAnoIngreso(int newAnoIngreso) {
        anoIngreso = newAnoIngreso;
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
