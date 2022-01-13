package day13_StringClass;

import java.util.Scanner;

public class String1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= input.nextInt();

        System.out.println("Enter your gender");
        String gender= input.next();
        input.nextLine();

        System.out.println("Enter your name");
        String name= input.nextLine();

        System.out.println("Enter your phone number");
        long number= input.nextLong();

        System.out.println("Enter your zip code");
        int zipcode= input.nextInt();
        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName= input.nextLine();

        System.out.println("Enter your city name");
        String cityName= input.nextLine();

        System.out.println("Enter your stateName");
        String stateName= input.next();

        System.out.println("Enter your building number");
        int buildingNumber= input.nextInt();

        System.out.println("Enter your street name");
        String streetName= input.nextLine();



    }
}
/*
1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in
 */