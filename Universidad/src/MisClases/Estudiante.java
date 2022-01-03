/** *********************************************************************
 * Module:  Estudiante.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Estudiante
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 0625c79e-749c-4165-841f-9c88a7d21e96
 */
public abstract class Estudiante extends Persona {

    /**
     * @pdOid 657b153e-a4d6-4e4d-8be5-db3acdaab3cb
     */
    protected String facultad;
    /**
     * @pdOid d25b4fc0-929f-452f-856c-542326645c55
     */
    protected String carrera;
    /**
     * @pdOid f2f2c43d-e028-4950-8751-c9654ef1815d
     */
    protected int nivel;
    /**
     * @pdOid 7de13dff-e822-4628-ab4b-8ab65f081bb7
     */
    protected int horasDeClases;
    /**
     * @pdOid fe2db7a9-e4b0-4b89-9fc6-ff137ef03941
     */
    protected int nroAsignatura;
    /**
     * @pdOid 49458272-0eb2-4785-9490-f991d5c52108
     */
    protected Asignatura asignatura;
    /**
     * @pdOid ac7b39b0-947f-4eae-b369-04035539b687
     */
    protected int credencialUniversidad;
    /**
     * @pdOid cc732da1-ab76-4916-9046-61397ea968d4
     */
    protected String tituloSerBachiller;

    public Estudiante(String nombre, String dni, String direccion, String telefono, String correo, String facultad,
            String carrera, int nivel, int horasDeClases, int nroAsignatura, Asignatura asignatura, int credencialUniversidad, String tituloSerBachiller) {
        super(nombre, dni, direccion, telefono, correo);
        this.facultad = facultad;
        this.carrera = carrera;
        this.nivel = nivel;
        this.horasDeClases = horasDeClases;
        this.nroAsignatura = nroAsignatura;
        this.asignatura = asignatura;
        this.credencialUniversidad = credencialUniversidad;
        this.tituloSerBachiller = tituloSerBachiller;
    }

    /**
     * @return @pdOid ab06b2f0-e31a-4ae8-922e-2780a09b58af
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param newFacultad
     * @pdOid 410c6f85-d995-4257-9563-e3bf1ed0b0f6
     */
    public void setFacultad(String newFacultad) {
        facultad = newFacultad;
    }

    /**
     * @return @pdOid 2a7f39bc-ff62-4097-be0d-52afaad87dc9
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param newCarrera
     * @pdOid ab5dd362-6f04-4236-add3-a6f02d2c706f
     */
    public void setCarrera(String newCarrera) {
        carrera = newCarrera;
    }

    /**
     * @return @pdOid 492bc68f-5d2c-4a41-b1da-c99b1f30dfb5
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param newNivel
     * @pdOid 07e1371b-c508-4919-aa32-2414da04a4b7
     */
    public void setNivel(int newNivel) {
        nivel = newNivel;
    }

    /**
     * @return @pdOid fcc15470-45ee-4927-98c2-3bcc67ce8bc2
     */
    public int getHorasDeClases() {
        return horasDeClases;
    }

    /**
     * @param newHorasDeClases
     * @pdOid 1189fffd-4516-4b70-acc6-f1f9d6f4972f
     */
    public void setHorasDeClases(int newHorasDeClases) {
        horasDeClases = newHorasDeClases;
    }

    /**
     * @return @pdOid 5a2de8a4-f358-43bf-b390-4677ea24d5ab
     */
    public int getNroAsignatura() {
        return nroAsignatura;
    }

    /**
     * @param newNroAsignatura
     * @pdOid 9144eaaf-2d26-4fc0-97cf-11b0718323dc
     */
    public void setNroAsignatura(int newNroAsignatura) {
        nroAsignatura = newNroAsignatura;
    }

    /**
     * @return @pdOid ea1141d7-fc64-42d8-8c85-f92bc2a99d47
     */
    public Asignatura getAsignatura() {
        return asignatura;
    }

    /**
     * @param newAsignatura
     * @pdOid 75fb763e-2cc5-4dea-ab32-698006f64864
     */
    public void setAsignatura(Asignatura newAsignatura) {
        asignatura = newAsignatura;
    }

    /**
     * @return @pdOid 11c536e0-acbc-4fb2-a006-da7c686d3a44
     */
    public int getCredencialUniversidad() {
        return credencialUniversidad;
    }

    /**
     * @param newCredencialUniversidad
     * @pdOid 09d03963-05f6-4a95-8e0d-165bddf836cd
     */
    public void setCredencialUniversidad(int newCredencialUniversidad) {
        credencialUniversidad = newCredencialUniversidad;
    }

    /**
     * @return @pdOid 7b6915e5-908c-45b7-8880-907a0f603213
     */
    public String getTituloSerBachiller() {
        return tituloSerBachiller;
    }

    /**
     * @param newTituloSerBachiller
     * @pdOid 52cc9cfb-4ccb-499e-a3d9-13f24da23c0b
     */
    public void setTituloSerBachiller(String newTituloSerBachiller) {
        tituloSerBachiller = newTituloSerBachiller;
    }

}
