package day12_ScannerCreation;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the radius of the circle:");
        double r= scan.nextDouble();
        double area= r*r*3.14;
        double perimeter= 2*r*3.14;

        System.out.println("area= "+area);
        System.out.println("primeter= "+perimeter);

        scan.close();







    }
}
