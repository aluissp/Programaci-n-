/** *********************************************************************
 * Module:  Asignatura.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Asignatura
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 57a92d97-e0fd-4f2d-a69c-940cadfe49bf
 */
public abstract class Asignatura {

    /**
     * @pdOid 79b4653d-77e7-4e00-af92-eed9f505040b
     */
    private String nombre;
    /**
     * @pdOid 809f8bd2-0a2c-4e47-ac34-90ed629f11d6
     */
    private int horasClase;
    /**
     * @pdOid 142044e0-913d-4908-8a49-8af07e2d4b97
     */
    private double promedio;
    /**
     * @pdOid 88676d11-8a3a-4dd3-96b0-c5caa37ef67a
     */
    private double nota1;
    /**
     * @pdOid fdd62c26-1d6a-4521-a635-ff813d2baa82
     */
    private double nota2;
    /**
     * @pdOid 9d9f283a-ca31-4d10-a910-41da08def1e3
     */
    private boolean aprobar;

    public Asignatura(String nombre, int horasClase, double promedio, double nota1, double nota2) {
        this.nombre = nombre;
        this.horasClase = horasClase;
        this.promedio = promedio;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    /**
     * @return * @pdOid 887e14f9-9a24-41f2-94c4-011b259af727
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param newNombre
     * @pdOid 2c9a1d66-ca85-4a5e-98aa-c0dc26b79128
     */
    public void setNombre(String newNombre) {
        nombre = newNombre;
    }

    /**
     * @pdOid 5a9494d1-dc56-446a-85fe-1013f1cefdd5
     */
    public int getHorasClase() {
        return horasClase;
    }

    /**
     * @param newHorasClase
     * @pdOid f40170ac-6171-453b-93cb-d3651c3c84d7
     */
    public void setHorasClase(int newHorasClase) {
        horasClase = newHorasClase;
    }

    /**
     * @pdOid 3382ebbe-0665-4661-b77e-bcc88ea95344
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param newPromedio
     * @pdOid 52b5c113-e0e8-45a1-adcc-2abea89abae5
     */
    public void setPromedio(double newPromedio) {
        promedio = newPromedio;
    }

    /**
     * @pdOid d51a60c0-e9c3-4592-a221-db218ee1d4e3
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param newNota1
     * @pdOid cb01a76f-08f4-4ab2-9fb8-2b3048b4e00c
     */
    public void setNota1(double newNota1) {
        nota1 = newNota1;
    }

    /**
     * @return @pdOid b8b500e5-6879-4434-8381-016b0ede8413
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param newNota2
     * @pdOid ac63e595-4848-42fd-b97f-0f4ac5049cca
     */
    public void setNota2(double newNota2) {
        nota2 = newNota2;
    }

    /**
     * @return * @pdOid fa083829-8d31-4ab1-96af-d2e242028ccc
     */
    public boolean getAprobar() {
        return aprobar;
    }

    /**
     * @param newAprobar
     * @pdOid a5e2d6da-6b4e-4557-a8d4-7ae77f8796fe
     */
    public void setAprobar(boolean newAprobar) {
        aprobar = newAprobar;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
