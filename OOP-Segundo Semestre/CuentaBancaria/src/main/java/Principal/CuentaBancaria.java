package Principal;

public class CuentaBancaria {

    private Usuario usuarioN;
    private Fecha FCreacion;
    private double saldo;
    public static double saldoMinimo;
    private String contraseña;

    public CuentaBancaria(Usuario usuarioN, String contraseña, double saldo) {
        this.usuarioN = usuarioN;

        this.contraseña = contraseña;

        if (saldo >= saldoMinimo) {
            this.saldo = saldo;
        }

        //Captando la fecha actual
        FCreacion = new Fecha();
    }

    public CuentaBancaria(Usuario usuarioN, double saldo) {
        this.usuarioN = usuarioN;

        this.contraseña = null;

        if (saldo >= saldoMinimo) {
            this.saldo = saldo;
        }

        //Captando la fecha actual
        FCreacion = new Fecha();
    }

    public Usuario getUsuarioN() {
        return usuarioN;
    }

    public void setUsuarioN(String nombre, int dia, int mes, int año) {
        this.usuarioN.setNombre(nombre);
        this.usuarioN.setfNacimiento(dia, mes, año);
    }

    public Fecha getFCreacion() {
        return FCreacion;
    }

    public void setFCreacion(Fecha FCreacion) {
        this.FCreacion = FCreacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void depositar(double saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
        } else {
            System.out.println("Saldo invalido");
        }
    }

    public void retirar(double saldo) {
        if ((this.saldo - saldo) >= saldoMinimo) {
            this.saldo = this.saldo - saldo;
        } else {
            System.out.println("No es posible realizar el retiro");
        }
    }

    public String imprimirDatos() {
        return "Saldo: " + this.saldo + "      Fecha Creacion: " + this.FCreacion.imprimirDatos();
    }

}
