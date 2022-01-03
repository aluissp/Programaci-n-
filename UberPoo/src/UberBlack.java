public class UberBlack extends Carro{
    String tipoCarroAceptado;
    String material;

    public UberBlack(String licencia,Cuenta conductor,String tipoCarroAceptado,String material){
        super(licencia,conductor);
        this.tipoCarroAceptado=tipoCarroAceptado;
        this.material=material;
    }
}
