public class UberX extends Carro{
    String modelo;
    String marca;

    public UberX(String licencia,Cuenta conductor,String modelo,String marca){
        super(licencia,conductor);
        this.modelo=modelo;
        this.marca=marca;
    }

    @Override
    void imprimeDatosCarro(){
        super.imprimeDatosCarro();
        System.out.println("modelo: "+modelo+" marca: "+marca);
    }
}
