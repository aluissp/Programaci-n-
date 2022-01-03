package MisClases;

import java.net.InetAddress;
import java.net.UnknownHostException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class SistemaOp {

    private String so;
    private String version;
    private String arquitectura;
    private String proveedor;
    private String usuario;
    private String raiz;
    private String directorioActual;
    private String jdk;
    private String procesador;

    public SistemaOp() {
        ObtenerDatos();
    }

    private void ObtenerDatos() {
        so = System.getProperty("os.name");
        version = System.getProperty("os.version");
        arquitectura = System.getProperty("os.arch");
        proveedor = System.getProperty("java.vendor");
        usuario = System.getProperty("user.name");
        raiz = System.getProperty("user.home");
        directorioActual = System.getProperty("user.dir");
        jdk = System.getProperty("java.version");
        procesador = System.getenv("PROCESSOR_IDENTIFIER");
    }

    public String getProcesador() {
        return procesador;
    }

    public String DireccionIp() {
        String s = "";
        try {

            InetAddress direccion = InetAddress.getLocalHost();
            String nombreDelHost = direccion.getHostName();
            String IP_local = direccion.getHostAddress();
            s += "IP de la maquina local: " + IP_local;
            s += "\nHost local: " + nombreDelHost;

        } catch (UnknownHostException e) {
            System.out.println("Error, " + e);
        }
        return s;
    }

    public String getJdk() {
        return jdk;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getRaiz() {
        return raiz;
    }

    public String getDirectorioActual() {
        return directorioActual;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getSo() {
        return so;
    }

    public String getVersion() {
        return version;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    @Override
    public String toString() {
        return "Informacion del Sistema Operativo\n"
                + "\nSistema Operativo: " + so + "\nVersion : " + version + "\nArquitectura : " + arquitectura
                + "\nUsuario: " + usuario + "\nRaiz: " + raiz + "\nDirectorio Actual: " + directorioActual
                + "\nProveedor: " + proveedor + "\nVersion de java: " + jdk + "\nProcesador: " + procesador
                + "\n" + DireccionIp();

    }
}
