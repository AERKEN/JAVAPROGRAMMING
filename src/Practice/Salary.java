package Practice;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("your hourly rate");
        int hourly= input.nextInt();

        System.out.println("your weekly hour");
        int weekly= input.nextInt();

        System.out.println(" enter state tax");
        double stateTax= input.nextDouble();

        System.out.println("enter federal tax");
        double federalTax= input.nextDouble();
        double totalTax=(stateTax+federalTax);

        System.out.println("totalTax:"+stateTax+federalTax);
        System.out.println("netWeeklyIncome:"+hourly*weekly*totalTax);

        input.close();
    }
}
