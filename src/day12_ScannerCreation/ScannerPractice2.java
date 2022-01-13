package day12_ScannerCreation;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter true or false");
        boolean result=input.nextBoolean(); //boolean

        String name= input.next();  //next
        System.out.println("name= "+name);

        input.close();






    }
}
