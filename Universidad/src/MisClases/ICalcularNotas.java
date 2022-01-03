/** *********************************************************************
 * Module:  ICalcularNotas.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Interface ICalcularNotas
 ********************************************************************** */
package MisClases;

/**
 * @pdOid 973f9ffb-2cfa-49c1-973e-320dc2cf2811
 */
public interface ICalcularNotas {

    /**
     * @pdOid f9b2c487-4947-4566-b1a1-c99ce123ae27
     */
    static final double NOTA_MINIMA = 7;

    /**
     * @return @pdOid 438acae2-eebd-44cc-8d5c-3fc4f0ad2057
     */
    double iCalcularPromedio();

    /**
     * @return @pdOid 12018e22-710e-40b7-8671-b1257b682e69
     */
    boolean iAprobarMateria();

}
