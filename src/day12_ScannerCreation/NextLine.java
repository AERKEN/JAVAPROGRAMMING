package day12_ScannerCreation;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println(" Enter your age :");
        int age= input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName= input.nextLine();

        System.out.println("enter your GPA: ");
        double num= input.nextDouble();

        input.nextLine();
        System.out.println("school name: ");
        String name= input.nextLine();
input.close();





    }
}
