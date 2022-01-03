/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDDAgenda;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armando Perugachi
 */
public class Persona {

    private String DNI;
    private String nombre;
    private String telefono;
    private String correo;

    public Persona() {
        this.DNI = "";
        this.nombre = "";
        this.correo = "";
        this.telefono = "";
    }

    public void Mostrar(List listDatos, DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (int x = 0; x < listDatos.size(); x++) {
            Persona p = (Persona) listDatos.get(x);
            modelo.addRow(new Object[]{p.getDNI(),
                p.getNombre(),
                p.getTelefono(),
                p.getCorreo()});
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
