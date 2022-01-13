package LoopTask;

import java.util.Scanner;

public class Task2_mathOperator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter first number");
        int n1=s.nextInt();
        System.out.println("Enter second number");
        int n2=s.nextInt();
        System.out.println("Enter a math operator");
        char op=s.next().charAt(0);
        int result=0;

        while (!(op=='*'||op=='/'||op=='+'||op=='-')){
            System.out.println("Invalid operator");
            op=s.next().charAt(0);
        }
        if (op=='*'){
            result=n1*n2;

        }else if (op=='+'){
           result=n1+n2;
        }else if(op=='-'){
            result=n1-n2;
        }else{
            result=n1/n2;
        }
        System.out.println(result);


    }
}
