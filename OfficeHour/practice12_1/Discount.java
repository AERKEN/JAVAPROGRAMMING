package practice12_1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your quantity");
        int quantity= scan.nextInt();

        double unitPrice=100;
        double totalCost=quantity*unitPrice;
        double discountRate=0.1;
        double totalDiscount;

        if(totalCost>=1000){
            totalDiscount=discountRate*totalCost;
            System.out.println("You will get a discount of "+totalDiscount+"and your total will be "+(totalCost-totalDiscount));

        }else{
            System.out.println("No discount");
        }






    }
}
/*

 */