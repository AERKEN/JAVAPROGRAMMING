package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "white", 20000, 2025, 123456);

        Tesla tesla = new Tesla("Model S", "Red", 94990, 2030, 0);

        BMW bmw = new BMW("X5", "black", 67350, 2030, 12000);


        toyota.start();
        tesla.start();
        bmw.start();








    }




}