package Practice;

import javax.lang.model.SourceVersion;

public class Tasks {
    public static void main(String[] args) {
        byte a= 15, b=20;
        System.out.println("a = " +b);
        System.out.println("b = " +a);

        int year= 2016;
        boolean IsLeapYear= (year%4==0);
        System.out.println(year+" is leap year :"+IsLeapYear);

        byte hourlyRate=50, weeklyHour=40;
        double stateTaxRate=6.5, federalTaxRate=26.2;

        int salaryBeforeTax= hourlyRate*weeklyHour* 52;
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*federalTaxRate/100;
        double totalTax= stateTax+federalTax;
        double salaryAfterTax= salaryBeforeTax-totalTax;

        System.out.println("Gross pay is : $"+salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);





    }
}
