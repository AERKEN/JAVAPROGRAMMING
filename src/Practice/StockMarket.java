package Practice;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many total shares you have ");
        int shares= input.nextInt();

        if (shares<=0){
            input.close();
        }
        System.out.println("How much your total value in the stock market");
        double totalValue= input.nextDouble();
        input.nextLine();
        System.out.println("Enter the name of the company");
        String name= input.nextLine();

        System.out.println("Your total stock market holding is $"+totalValue+
                " which is made up of "+shares+". "+name+" is your company holdings.");
         input.close();

    }
}
