public class Carro {

    private Integer id;
    private String licencia;
    private Cuenta conductor;
    private Integer pasajeros;

    public Carro(String licencia,Cuenta conductor){
        this.licencia=licencia;
        this.conductor=conductor;
    }


    void imprimeDatosCarro(){
        if(pasajeros!=null) {
            System.out.println("licencia: " + licencia + " nombre: " + conductor.nombre + " pasajeros: " + pasajeros);
        }
    }

    public Integer getPasajeros(){
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros){
        if(pasajeros==4||pasajeros==6){
            this.pasajeros=pasajeros;
        }else{
            System.out.println("Porfavor asigne 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Cuenta getConductor() {
        return conductor;
    }

    public void setConductor(Cuenta conductor) {
        this.conductor = conductor;
    }
}
