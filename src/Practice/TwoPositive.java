package Practice;

import java.util.Scanner;

public class TwoPositive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two positive number");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int result=0;
        for (int i = 0; i <b ; i++) {
            result+= a;

        }
        System.out.println(result);

    }}

