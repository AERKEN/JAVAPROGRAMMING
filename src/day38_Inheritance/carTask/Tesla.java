package day38_Inheritance.carTask;

public class Tesla extends Car {

    public Tesla( String model, String color, int year, double price, double miles) {
        super("Tesla", model, color, year, price, miles);
    }



    public void autoPilot(){
        System.out.println(brand+model+" is auto pilot");

    }

    @Override
    public void start() {
        System.out.println("Say start to " );
    }

    @Override
    public void drive() {
        super.drive();
    }
}
