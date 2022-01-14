package ReplitBasic;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println( "Enter cents:");
        int cents=scan.nextInt();


        if(cents>0&&cents<100){
            System.out.println("Your change is " +(cents/25)+" quarters, "
                    +(cents%25)/10+" dimes, " +(cents%25%10/5)+" nickels, and "
                    +(cents%5/1)+" pennies");
        }else{
            System.out.println("Invalid cents amount");

        }scan.close();



    }
}