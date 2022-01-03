package ModeloClases;

/***********************************************************************
 * Module:  Curso.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Class Curso
 ***********************************************************************/

import java.util.*;

/** @pdOid 9944703c-7754-4f9c-b7bc-452ec068fb3d */
public class Curso {
   /** @pdOid 2acfdc7b-4408-46be-978f-ce0ec5ce275d */
   private String nombre;
   /** @pdOid 783ec84b-a8c7-4302-a458-5962fae4022e */
   private ArrayList listaEstudiantes;
   /** @pdOid d92ec571-07cc-4baa-af06-494a15192bfd */
   private double promedioGeneral;
   
   /** @pdRoleInfo migr=no name=Estudiante assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Estudiante> estudiante;
   
   /** @pdOid 6f599453-5710-498d-bd0a-20209a72c899 */
   public String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 37864cb1-8a8c-47e3-a644-4425c89e306d */
   public void setNombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 598ee704-92b4-4ae0-a604-d54050c9d64f */
   public ArrayList getListaEstudiantes() {
      return listaEstudiantes;
   }
   
   /** @param newListaEstudiantes
    * @pdOid 6fe8e01d-2e8d-4b10-aa27-6a2eada55855 */
   public void setListaEstudiantes(ArrayList newListaEstudiantes) {
      listaEstudiantes = newListaEstudiantes;
   }
   
   /** @pdOid 14a49400-ea82-463d-9657-49aba3defe52 */
   public double getPromedioGeneral() {
      return promedioGeneral;
   }
   
   /** @param newPromedioGeneral
    * @pdOid 3ae83ba0-0f14-4fbc-bfdb-a2fbfcd8234c */
   public void setPromedioGeneral(double newPromedioGeneral) {
      promedioGeneral = newPromedioGeneral;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Estudiante> getEstudiante() {
      if (estudiante == null)
         estudiante = new java.util.HashSet<Estudiante>();
      return estudiante;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEstudiante() {
      if (estudiante == null)
         estudiante = new java.util.HashSet<Estudiante>();
      return estudiante.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEstudiante */
   public void setEstudiante(java.util.Collection<Estudiante> newEstudiante) {
      removeAllEstudiante();
      for (java.util.Iterator iter = newEstudiante.iterator(); iter.hasNext();)
         addEstudiante((Estudiante)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEstudiante */
   public void addEstudiante(Estudiante newEstudiante) {
      if (newEstudiante == null)
         return;
      if (this.estudiante == null)
         this.estudiante = new java.util.HashSet<Estudiante>();
      if (!this.estudiante.contains(newEstudiante))
         this.estudiante.add(newEstudiante);
   }
   
   /** @pdGenerated default remove
     * @param oldEstudiante */
   public void removeEstudiante(Estudiante oldEstudiante) {
      if (oldEstudiante == null)
         return;
      if (this.estudiante != null)
         if (this.estudiante.contains(oldEstudiante))
            this.estudiante.remove(oldEstudiante);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEstudiante() {
      if (estudiante != null)
         estudiante.clear();
   }

}