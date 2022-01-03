/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Armando Perugachi
 */
public class Estudiantes {

    private String cedula;
    private String nombre;
    private int nota1;
    private int nota2;
    
    public Estudiantes(){
        this.cedula = "";
        this.nombre = "";
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public Estudiantes(String cedula, String nombre, int nota1, int nota2) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula.length() > 0) {
            this.cedula = cedula;
        } else {
            this.cedula = "";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        if (nota1 > 0) {
            this.nota1 = nota1;
        } else {
            this.nota1 = 0;
        }
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        if (nota2 > 0) {
            this.nota2 = nota2;
        } else {
            this.nota2 = 0;
        }
    }

}
