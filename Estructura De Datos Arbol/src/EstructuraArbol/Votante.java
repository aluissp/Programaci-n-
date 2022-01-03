/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraArbol;

/**
 *
 * @author Armando Perugachi
 */
public class Votante {

    private String Cedula;
    private String Nombre;
    private int CodProvincia;
    private int CodCanton;
    private int CodParroquia;
    private String Recinto;
    private int NumeroMesa;

    public Votante(String Cedula, String Nombre, int CodProvincia, int CodCanton,
            int CodParroquia, String Recinto, int NumeroMesa) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.CodProvincia = CodProvincia;
        this.CodCanton = CodCanton;
        this.CodParroquia = CodParroquia;
        this.Recinto = Recinto;
        this.NumeroMesa = NumeroMesa;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodProvincia() {
        return CodProvincia;
    }

    public void setCodProvincia(int CodProvincia) {
        this.CodProvincia = CodProvincia;
    }

    public int getCodCanton() {
        return CodCanton;
    }

    public void setCodCanton(int CodCanton) {
        this.CodCanton = CodCanton;
    }

    public int getCodParroquia() {
        return CodParroquia;
    }

    public void setCodParroquia(int CodParroquia) {
        this.CodParroquia = CodParroquia;
    }

    public String getRecinto() {
        return Recinto;
    }

    public void setRecinto(String Recinto) {
        this.Recinto = Recinto;
    }

    public int getNumeroMesa() {
        return NumeroMesa;
    }

    public void setNumeroMesa(int NumeroMesa) {
        this.NumeroMesa = NumeroMesa;
    }

    @Override
    public String toString() {
        return "Cedula: " + Cedula + ", Nombre: " + Nombre + ", CodProvincia: "
                + CodProvincia + ", CodCanton: " + CodCanton + ", CodParroquia: "
                + CodParroquia + ", Recinto: " + Recinto + ", NumeroMesa: " + NumeroMesa;
    }

}
