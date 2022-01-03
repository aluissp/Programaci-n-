package ModeloClases;

/**
 * *********************************************************************
 * Module: Estudiante.java Author: Usuario Purpose: Defines the Class Estudiante
 * *********************************************************************
 */
public class Estudiante extends Persona {

    private String tipoDeSangre;
    private double nota1;
    private double nota2;
    private double promedio;
    private int diasAsistidos;
    private boolean matriculado = false;
    private double precioCurso = 0;

    public double getPrecioCurso() {
        return precioCurso;
    }

    public void setPrecioCurso(double precioCurso) {
        this.precioCurso = precioCurso;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String newTipoDeSangre) {
        tipoDeSangre = newTipoDeSangre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double newNota1) {
        nota1 = newNota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setPromedio(double newPromedio) {
        promedio = newPromedio;
    }

    public void setNota2(double newNota2) {
        nota2 = newNota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getDiasAsistidos() {
        return diasAsistidos;
    }

    public void setDiasAsistidos(int newDiasAsistidos) {
        diasAsistidos = newDiasAsistidos;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean newMatriculado) {
        matriculado = newMatriculado;
    }

    public boolean pagarMatricula() {
        return false;
    }

    @Override
    public String toString() {
        return "Estudiante\n"
                + "Dni: " + super.dni
                + "\nNombre: " + super.nombre
                + "\nApellido:" + super.apellido
                + "\nCorreo: " + super.correo;
    }

    public String dniTutor;
}
