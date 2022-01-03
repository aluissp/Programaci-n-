package Uber;

public class Main {

    public static void main(String[] args) {

        UberX uberX = new UberX("IMQ543", new Account("Perro Castigador", "LPR123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        System.out.println();

        UberVan uberVan = new UberVan("KLA905", new Account("Perro Opresor", "TDF043"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}
