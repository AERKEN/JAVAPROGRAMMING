package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Aerken",
                buildingNumber= "11821B",
                streetName="Berkindale",
                cityName="NY",
                province="ON",
                country="Canada";
        String address= name+ "\n" +buildingNumber+ " "+ streetName+ " " +"\n" +cityName+ " "+country;
        System.out.println(address);

    }
}
