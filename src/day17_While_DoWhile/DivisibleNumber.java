package day17_While_DoWhile;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String d3="";
        String d5="";
        String d15="";

        System.out.println("Enter a number");
        int n=s.nextInt();

        for (int i = 1; i <=n ; i++) {

            if (i%15==0){
                d15+=" "+i;

            }else if(i%3==0&&i%15!=0){
                d3+=" "+i;
            }else if(i%5==0&&i%15!=0){
                d5+=" "+i;
            }

        }System.out.println("Divisible by 15:"+d15);
        System.out.println("Divisible by 5:"+d5);
        System.out.println("Divisible by 3:"+d3);




    }
}
