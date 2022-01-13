package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNum){
        System.out.println(brand+" "+model+" "+phoneNum+" is calling face time");
    }

    public void faceTime(String email){
        System.out.println(email+" is calling face time to "+model+size+" Iphone");
    }







}
