package day36_Inheritance.homeWork;

public class Phone {

    public String brand, model ,size ,color;
    public double price;


    public void setInfo(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNum){

        System.out.println(" is calling");

    }

    public void text(long phoneNum){
        System.out.println();
    }




    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
