package practice_12_08;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("How many fibonacci num do you want to see?");
        int num=s.nextInt();
        int n1=0;
        int n2=1;
        int res=0;

        System.out.println(n1);
        System.out.println(n2);

        for (int i=2;i<num;i++){
            res=n1+n2;
            System.out.println(res);
            n1=n2;
            n2=res;
        }

        System.out.println(res);




    }
}


/* Create a program that will give you the Fibonacci numbers up to the x value.

                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

                         */