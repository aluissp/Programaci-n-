/** *********************************************************************
 * Module:  EstudianteVirtual.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class EstudianteVirtual
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 19544794-274f-4c67-9e88-8c933726b829
 */
public class EstudianteVirtual extends Estudiante implements ICalcularNotas {

    /**
     * @pdOid fc6e5fac-d4f6-4aff-a7e7-fdd06c27e534
     */
    private String plataforma;

    public EstudianteVirtual(String nombre, String dni, String direccion, String telefono, String correo,
            String facultad, String carrera, int nivel, int horasDeClases, int nroAsignatura,
            Asignatura asignatura, int credencialUniversidad, String tituloSerBachiller, String plataforma) {
        super(nombre, dni, direccion, telefono, correo, facultad, carrera, nivel, horasDeClases, nroAsignatura, asignatura, credencialUniversidad, tituloSerBachiller);
        this.plataforma = plataforma;
    }

    /**
     * @return @pdOid 2ff92631-1b8f-415f-9dbd-0718846df151
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param newPlataforma
     * @pdOid 15bc6eae-2648-42a4-b37b-489365a0d032
     */
    public void setPlataforma(String newPlataforma) {
        plataforma = newPlataforma;
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
