package day12_ScannerCreation;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name= input.nextLine();

        System.out.println("Enter your building num:");
        int num= input.nextInt();
        input.nextLine();

        System.out.println("street name");
        String street= input.nextLine();

        System.out.println("city name");
        String city=input.nextLine();

        System.out.println("country");
        String CA= input.nextLine();

        input.close();




    }
}
