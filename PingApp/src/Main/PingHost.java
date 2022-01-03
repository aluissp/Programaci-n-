/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author Luis Perugachi
 */
public class PingHost {

    private String host;

    public String conectarIP(String host) {
        this.host = host;
        String respuesta = "\nLa dirección " + host;
        try {
            InetAddress direccion = InetAddress.getByName(host);

            boolean conectable = direccion.isReachable(10000);

            respuesta += (conectable) ? ", responde correctamente" : ", no responde!";

        } catch (IOException e) {
            System.out.println("Error, " + e);
        }
        return respuesta;
    }

    public String obtenerIP(String host) {
        this.host = host;
        String respuesta = "\nLa dirección IP es: ";

        try {
            respuesta += InetAddress.getByName(host).getHostAddress();
            
        } catch (IOException e) {
            System.out.println("Error, " + e);
        }

        return respuesta;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
