/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPila;

/**
 *
 * @author Armando Perugachi
 */
public class Notas {

    private String cedula;
    private String codMateria;
    private double nota1 = 0;
    private double nota2 = 0;
    private double notaSupletorio = 0;

    public Notas(String cedula, String codMateria, double nota1, double nota2, double notaSupletorio) {
        this.cedula = cedula;
        this.codMateria = codMateria;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaSupletorio = notaSupletorio;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaSupletorio() {
        return notaSupletorio;
    }

    public void setNotaSupletorio(double notaSupletorio) {
        this.notaSupletorio = notaSupletorio;
    }

}
