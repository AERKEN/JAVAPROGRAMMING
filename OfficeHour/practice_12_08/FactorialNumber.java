package practice_12_08;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();

        int res=1;

        if (num>2) {
            for (int i = num; i >= 1; i--) {
                res *= i;
            }
        }else {
            res=num;
        }

        System.out.println(res);



    }
}



/* Write a program that can return the factorial number of any given number

                                  Ex:
                                      input: 5
                                      output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
                              */
