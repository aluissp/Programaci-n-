package ModeloClases;


/** *********************************************************************
 * Module:  Docente.java
 * Author:  Usuario
 * Purpose: Defines the Class Docente
 ********************************************************************** */

import java.util.*;


public class Docente extends Personal implements ICalculosRendimientoAcademico {


    private int diasClase;
    private int nroMaterias;    

    
    public java.util.Collection<Curso> curso;
    
    public int getDiasClase() {
        return diasClase;
    }
    
    public void setDiasClase(int newDiasClase) {
        diasClase = newDiasClase;
    }
    
    public int getNroMaterias() {
        return nroMaterias;
    }
    
    public void setNroMaterias(int newNroMaterias) {
        nroMaterias = newNroMaterias;
    }
    
//    public boolean getRegistrarAsistencia() {
//        return registrarAsistencia;
//    }
//    
//    public void setRegistrarAsistencia(boolean newRegistrarAsistencia) {
//        registrarAsistencia = newRegistrarAsistencia;
//    }
//    
//    public boolean getRegistrarNota() {
//        return registrarNota;
//    }
//    
//    public void setRegistrarNota(boolean newRegistrarNota) {
//        registrarNota = newRegistrarNota;
//    }
    
    public Estudiante buscarEstudiante(String dni) {
        // TODO: implement
        return null;
    }
    
    public java.util.Collection<Curso> getCurso() {
        if (curso == null) {
            curso = new java.util.HashSet<Curso>();
        }
        return curso;
    }
    
    public java.util.Iterator getIteratorCurso() {
        if (curso == null) {
            curso = new java.util.HashSet<Curso>();
        }
        return curso.iterator();
    }
    
    public void setCurso(java.util.Collection<Curso> newCurso) {
        removeAllCurso();
        for (java.util.Iterator iter = newCurso.iterator(); iter.hasNext();) {
            addCurso((Curso) iter.next());
        }
    }
    
    public void addCurso(Curso newCurso) {
        if (newCurso == null) {
            return;
        }
        if (this.curso == null) {
            this.curso = new java.util.HashSet<Curso>();
        }
        if (!this.curso.contains(newCurso)) {
            this.curso.add(newCurso);
        }
    }
    
    public void removeCurso(Curso oldCurso) {
        if (oldCurso == null) {
            return;
        }
        if (this.curso != null) {
            if (this.curso.contains(oldCurso)) {
                this.curso.remove(oldCurso);
            }
        }
    }

    public void removeAllCurso() {
        if (curso != null) {
            curso.clear();
        }
    }

    @Override
    public double calcularPorcentajeAsistencia(int diasAsistencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPromedio(double nota1, double nota2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
