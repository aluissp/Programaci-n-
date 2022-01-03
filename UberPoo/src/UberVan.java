public class UberVan extends Carro{
    String tipoCarroAceptado;
    String material;
    Integer pasajeros;
/*
    public UberVan(String licencia,Cuenta conductor,String tipoCarroAceptado,String material){
        super(licencia,conductor);
        this.tipoCarroAceptado=tipoCarroAceptado;
        this.material=material;
    }*/

    public UberVan(String licencia,Cuenta conductor){
        super(licencia,conductor);
    }

    @Override
    public void setPasajeros(Integer pasajeros){
        if (pasajeros == 6) {
            this.pasajeros = pasajeros;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }


}
