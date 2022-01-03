package ModeloClases;

/***********************************************************************
 * Module:  EscuelaConduccion.java
 * Author:  Usuario
 * Purpose: Defines the Class EscuelaConduccion
 ***********************************************************************/

import java.util.*;

public class EscuelaConduccion {

   private String direccion;
   private String telefono;   
   private String correo;
      
   public java.util.Collection<Secretario> secretario;   
   public java.util.Collection<Docente> docente;   
   public java.util.Collection<Curso> curso;
      
   public String getDireccion() {
      return direccion;
   }
      
   public void setDireccion(String newDireccion) {
      direccion = newDireccion;
   }
      
   public String getTelefono() {
      return telefono;
   }
      
   public void setTelefono(String newTelefono) {
      telefono = newTelefono;
   }
      
   public String getCorreo() {
      return correo;
   }
      
   public void setCorreo(String newCorreo) {
      correo = newCorreo;
   }
      
   public java.util.Collection<Secretario> getSecretario() {
      if (secretario == null)
         secretario = new java.util.HashSet<Secretario>();
      return secretario;
   }
      
   public java.util.Iterator getIteratorSecretario() {
      if (secretario == null)
         secretario = new java.util.HashSet<Secretario>();
      return secretario.iterator();
   }
      
   public void setSecretario(java.util.Collection<Secretario> newSecretario) {
      removeAllSecretario();
      for (java.util.Iterator iter = newSecretario.iterator(); iter.hasNext();)
         addSecretario((Secretario)iter.next());
   }
    
   public void addSecretario(Secretario newSecretario) {
      if (newSecretario == null)
         return;
      if (this.secretario == null)
         this.secretario = new java.util.HashSet<Secretario>();
      if (!this.secretario.contains(newSecretario))
         this.secretario.add(newSecretario);
   }
      
   public void removeSecretario(Secretario oldSecretario) {
      if (oldSecretario == null)
         return;
      if (this.secretario != null)
         if (this.secretario.contains(oldSecretario))
            this.secretario.remove(oldSecretario);
   }
      
   public void removeAllSecretario() {
      if (secretario != null)
         secretario.clear();
   }
   
   public java.util.Collection<Docente> getDocente() {
      if (docente == null)
         docente = new java.util.HashSet<Docente>();
      return docente;
   }
      
   public java.util.Iterator getIteratorDocente() {
      if (docente == null)
         docente = new java.util.HashSet<Docente>();
      return docente.iterator();
   }
      
   public void setDocente(java.util.Collection<Docente> newDocente) {
      removeAllDocente();
      for (java.util.Iterator iter = newDocente.iterator(); iter.hasNext();)
         addDocente((Docente)iter.next());
   }
      
   public void addDocente(Docente newDocente) {
      if (newDocente == null)
         return;
      if (this.docente == null)
         this.docente = new java.util.HashSet<Docente>();
      if (!this.docente.contains(newDocente))
         this.docente.add(newDocente);
   }
      
   public void removeDocente(Docente oldDocente) {
      if (oldDocente == null)
         return;
      if (this.docente != null)
         if (this.docente.contains(oldDocente))
            this.docente.remove(oldDocente);
   }
      
   public void removeAllDocente() {
      if (docente != null)
         docente.clear();
   }
   
   public java.util.Collection<Curso> getCurso() {
      if (curso == null)
         curso = new java.util.HashSet<Curso>();
      return curso;
   }
   

   public java.util.Iterator getIteratorCurso() {
      if (curso == null)
         curso = new java.util.HashSet<Curso>();
      return curso.iterator();
   }
   
   public void setCurso(java.util.Collection<Curso> newCurso) {
      removeAllCurso();
      for (java.util.Iterator iter = newCurso.iterator(); iter.hasNext();)
         addCurso((Curso)iter.next());
   }
      
   public void addCurso(Curso newCurso) {
      if (newCurso == null)
         return;
      if (this.curso == null)
         this.curso = new java.util.HashSet<Curso>();
      if (!this.curso.contains(newCurso))
         this.curso.add(newCurso);
   }
      
   public void removeCurso(Curso oldCurso) {
      if (oldCurso == null)
         return;
      if (this.curso != null)
         if (this.curso.contains(oldCurso))
            this.curso.remove(oldCurso);
   }
      
   public void removeAllCurso() {
      if (curso != null)
         curso.clear();
   }

}