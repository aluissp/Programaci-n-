/** *********************************************************************
 * Module:  EstudiantePresencial.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class EstudiantePresencial
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 52eb0fb6-ef41-40e3-b5c4-0e40d0e1acb4
 */
public class EstudiantePresencial extends Estudiante implements ICalcularNotas {

    /**
     * @pdOid 7138b119-7576-4f19-b291-dce205133b55
     */
    private int nroAula;

    public EstudiantePresencial(String nombre, String dni, String direccion, String telefono, String correo,
            String facultad, String carrera, int nivel, int horasDeClases, int nroAsignatura,
            Asignatura asignatura, int credencialUniversidad, String tituloSerBachiller, int nroAula) {
        super(nombre, dni, direccion, telefono, correo, facultad, carrera, nivel, horasDeClases, nroAsignatura, asignatura, credencialUniversidad, tituloSerBachiller);
        this.nroAula = nroAula;
    }

    /**
     * @return @pdOid 7f76dbdb-bff1-4bf3-b2bc-d6f2f0875eb3
     */
    public int getNroAula() {
        return nroAula;
    }

    /**
     * @param newNroAula
     * @pdOid acd3198c-f802-49ab-949d-5214df8c63f4
     */
    public void setNroAula(int newNroAula) {
        nroAula = newNroAula;
    }

    @Override
    public double iCalcularPromedio() {
        return (this.asignatura.getNota1() + this.asignatura.getNota2()) / 2;
    }

    @Override
    public boolean iAprobarMateria() {
        return (ICalcularNotas.NOTA_MINIMA >= this.asignatura.getPromedio());
    }

}
