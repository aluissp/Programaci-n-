package Principal;

public class Usuario {

    private String nombre;
    private Fecha fNacimiento;

    public Usuario(String nombre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.fNacimiento = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int dia, int mes, int año) {
        this.fNacimiento.setAño(año);
        this.fNacimiento.setMes(mes);
        this.fNacimiento.setDia(dia);
    }

    public String imprimirUsuario() {
        return "Usuario: " + this.nombre + "       Fecha Nacimiento: " + this.fNacimiento.imprimirDatos(true);
    }
}
