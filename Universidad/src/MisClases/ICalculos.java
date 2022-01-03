/** *********************************************************************
 * Module:  ICalculos.java
 * Author:  Armando Perugachi
 * Purpose: Defines the Interface ICalculos
 ********************************************************************** */
package MisClases;

/**
 * @pdOid fceea47c-88bf-4142-90d6-3ebf29df100d
 */
public interface ICalculos {

    /**
     * @pdOid 721540b5-293d-43d1-9f9c-d839b6bd7d09
     */
    static final double VALOR_IESS = 0.0935;

    /**
     * @param sueldo
     * @return
     * @pdOid 0d9b83a3-fea0-49c0-8756-79c587242a9c
     */
    double iCalculaIESS(double sueldo);

    /**
     * @param sueldo
     * @return
     * @pdOid 4d2e3236-2b5f-49d0-941a-4a264bde3179
     */
    double iCalcularSueldo(double sueldo);

}
