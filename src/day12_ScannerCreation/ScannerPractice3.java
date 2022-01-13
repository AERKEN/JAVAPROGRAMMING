package day12_ScannerCreation;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name: ");
        String fullName= input.nextLine();

        System.out.println("enter your programming language: ");
        String programming= input.nextLine();

        System.out.println("full name: "+fullName);
        System.out.println("programming: "+programming);

        System.out.println("enter your age ");
        int age =input.nextInt();

        input.nextLine();  // capture the enter kry that user pressed for nextInt

        System.out.println("enter your school name :");
        input.close();








    }
}
