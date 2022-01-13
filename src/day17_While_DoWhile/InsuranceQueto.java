package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQueto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your gender");
        String gender = input.next();

        while (!(gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male"))) {
            System.out.println("Please reenter!");
            gender = input.next();
        }
        System.out.println("Are you married?");
        String isMarried = input.next();
        while (!(isMarried.equalsIgnoreCase("yes") || isMarried.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, please reenter!");
            isMarried = input.next();
        }
        System.out.println("Enter your age");
        int age = input.nextInt();
        while (!(age > 0 && age < 120)) {
            System.out.println("Invalid entry, please reenter!");
            age = input.nextInt();
        }
        System.out.println("How many miles you drive");
        double miles = input.nextInt();
        while (!(miles > 0 && miles > 5)) {
            System.out.println("Invalid entry, please reenter!");
            miles = input.nextDouble();
        }
        input.nextLine();

        System.out.println("full coverage or liability insurance?");
        String coverageOrLiability = input.nextLine();

        System.out.println("Have you have any accidents or claims in past 5 years?");
        String accidents = input.next();
        while (!(accidents.equalsIgnoreCase("yes") || accidents.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry. Please re-enter");
            accidents = input.next();
        }

        System.out.println("Your car has an anti-theft device ?");
        String hasAntiTheft = input.next();
        while (!(hasAntiTheft.equalsIgnoreCase("yes") || hasAntiTheft.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry, please reenter!");
            hasAntiTheft = input.next();
        }
        double startingPriceForLiability = 0;
        double startingPriceForFullCoverage = 0;
        double priceForEachMileLiability = 0;
        double priceForEachMileFullCoverage = 0;
        double priceForLiability = 0;
        double priceForFullCoverage = 0;

        if (coverageOrLiability.equalsIgnoreCase("liability")) {
            if (age < 25) {
                startingPriceForLiability = 90;
            } else {
                startingPriceForLiability = 50;
            }
            if (miles <= 10) {
                priceForEachMileLiability = 10;
            } else if (miles > 50) {
                priceForEachMileLiability = 50;
            } else {
                priceForEachMileLiability = 30;
            }
            priceForLiability = startingPriceForLiability + miles * priceForEachMileLiability;

            if (hasAntiTheft.equalsIgnoreCase("yes")) {
                priceForLiability -= priceForLiability * 0.05;
            }
            if (accidents.equalsIgnoreCase("yes")) {
                priceForLiability -= priceForLiability * 0.15;
            }
            if (accidents.equalsIgnoreCase("no")) {
                priceForLiability -= priceForLiability * 0.10;
            }
            if (isMarried.equalsIgnoreCase("yes")) {
                priceForLiability -= priceForLiability * 0.05;
            }
            System.out.println(name + " your quote for liability Insurance is $" + priceForLiability);

        }else if(coverageOrLiability.equalsIgnoreCase("full coverage")){
            if (age < 25){
                startingPriceForFullCoverage = 160;
            }else {
                startingPriceForFullCoverage = 120;
            }

            if (miles<=10){
                priceForEachMileFullCoverage = 20;
            }else if (miles>50){
                priceForEachMileFullCoverage = 70;
            }else {
                priceForEachMileLiability = 40;
            }
            priceForFullCoverage = startingPriceForFullCoverage + miles * priceForEachMileFullCoverage;

            if (hasAntiTheft.equalsIgnoreCase("yes")){
                priceForFullCoverage -= priceForFullCoverage * 0.05;
            }

            if (hasAntiTheft.equalsIgnoreCase("yes")){
                priceForFullCoverage += priceForFullCoverage * 0.15;
            }

            if (hasAntiTheft.equalsIgnoreCase("no")){
                priceForFullCoverage -= priceForFullCoverage * 0.10;
            }

            if (isMarried.equalsIgnoreCase("yes")){
                priceForFullCoverage -= priceForFullCoverage * 0.05;
            }

            System.out.println(name + " your quote for full coverage insurance is $" + priceForFullCoverage);

        }

        }






    }









