package ModeloClases;

/***********************************************************************
 * Module:  Personal.java
 * Author:  Usuario
 * Purpose: Defines the Class Personal
 ***********************************************************************/

import java.util.*;


public abstract class Personal extends Persona {
   
   protected String titulo;   
   protected Double sueldo;
   
   public String getTitulo() {
      return titulo;
   }
      
   public void setTitulo(String newTitulo) {
      titulo = newTitulo;
   }
      
   public Double getSueldo() {
      return sueldo;
   }
      
   public void setSueldo(Double newSueldo) {
      sueldo = newSueldo;
   }

}