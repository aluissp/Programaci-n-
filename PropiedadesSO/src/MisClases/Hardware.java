/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.io.File;

/**
 *
 * @author luis
 */
public class Hardware {

    private String nProcesos;
    private String mLibre;
    private String procesosD;
    private String mMaxima;
    private String mTotal;

    public Hardware() {
        Obtener();
    }

    private void Obtener() {
        nProcesos = System.getenv("NUMBER_OF_PROCESSORS");

    }

    public String getnProcesos() {
        return nProcesos;
    }

    @Override
    public String toString() {
        obtenerHardware();
        return "Informacion del hardware\n\n"
                + procesosD + "\n"
                + mLibre + "\n"
                + mMaxima + "\n"
                + mTotal + "\n"
                + obtenerHardware();
    }

    public String obtenerHardware() {
        String s = "\nAlmacenamiento";

        procesosD = "Procesos disponibles (cores): " + Runtime.getRuntime().availableProcessors();

        mLibre = "Memoria ram libre (bytes): " + Runtime.getRuntime().freeMemory();

        long maxMemory = Runtime.getRuntime().maxMemory();

        mMaxima = "Memoria ram maxima (bytes): " + (maxMemory == Long.MAX_VALUE ? "ninguna limitacion" : maxMemory);

        mTotal = "Total memoria disponible para JVM (bytes): " + Runtime.getRuntime().totalMemory();

        File[] roots = File.listRoots();

        for (File root : roots) {
            s += "\nDirectorio root: " + root.getAbsolutePath();
            s += "\nEspacio Total (bytes): " + root.getTotalSpace();
            s += "\nEspacio libre (bytes): " + root.getFreeSpace();
            s += "\nEspacio usable (bytes): " + root.getUsableSpace();
        }

        return s;
    }

}
