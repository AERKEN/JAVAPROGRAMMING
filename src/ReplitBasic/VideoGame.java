package ReplitBasic;

import java.util.Scanner;
public class VideoGame{
    public static void main(String[] args) {
        //Write your code here


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int num=scan.nextInt();

        int candy= num/10;
        int Gumballs=(num%10/3);

        if(num>3){
            System.out.println("Number of Candies: "+candy);
            System.out.println("Number of Gumballs: "+Gumballs);

        }else{
            System.out.println("Not enough coupons");
        }














    }
}
