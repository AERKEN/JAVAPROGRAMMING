package Practice;

import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the product name");
        String name= input.nextLine();

        System.out.println("Enter the price");
        double price= input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity= input.nextInt();

        System.out.println("Enter your first name");
        String firstName= input.next();

        System.out.println(firstName+"，your order for "+quantity+" "+name+" has been places." +
                " your total is "+(price*quantity)+" .");

        input.close();
    }
}
