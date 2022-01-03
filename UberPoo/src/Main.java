public class Main {

    public static void main(String[] args) {
        UberX uberX=new UberX("LKA2345",new Cuenta("Pelao Chuki","KWEI23411"),"Ferrari","AVEO");
        uberX.setPasajeros(4);
        uberX.imprimeDatosCarro();
        System.out.println();

        UberVan uberVan=new UberVan("LKJ123",new Cuenta("Jason Vargas","1292934832"));
        uberVan.setPasajeros(6);
        uberVan.imprimeDatosCarro();

    }
}
