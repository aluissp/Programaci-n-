package ModeloClases;

/***********************************************************************
 * Module:  ICalculosRendimientoAcademico.java
 * Author:  Usuario
 * Purpose: Defines the Interface ICalculosRendimientoAcademico
 ***********************************************************************/

import java.util.*;

public interface ICalculosRendimientoAcademico {

   static final int diasDeAsistencia = 100;
   static final int promedioMinimo = 7;
      
   double calcularPorcentajeAsistencia(int diasAsistencia);   
   double calcularPromedio(double nota1, double nota2);

}