package LoopTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //divide two positive numbers without using/ and * operators

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scan.nextInt();
        System.out.println("Enter second number");
        int num2= scan.nextInt();
        int result=0;

        while(num1>=num2){
            num1-=num2;
            result++;
        }
        System.out.println(result);
        System.out.println("_____________________________________");

        // calculate the sum of numbers

        System.out.println("Enter first number");
        int n1= scan.nextInt();
        System.out.println("Enter second number");
        int n2= scan.nextInt();
        int res=0;

        while(!(n1>0&&n2>0)) {
            System.out.println("invalid");
            scan.nextInt();
        }

            if (n1>0&&n2>0){
                res=n1+n2;
            }


        System.out.println(res);



    }
}
