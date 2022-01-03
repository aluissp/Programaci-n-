public class UberPool extends Carro{
    String modelo;
    String marca;

    public UberPool(String licencia,Cuenta conductor,String modelo,String marca){
        super(licencia,conductor);
        this.modelo=modelo;
        this.marca=marca;
    }
}
