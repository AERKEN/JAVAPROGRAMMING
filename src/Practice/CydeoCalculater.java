package Practice;

import java.util.Scanner;

public class CydeoCalculater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Enter first number");
            int n1 = s.nextInt();
            System.out.println("Enter a math operator");
            String mathOp = s.next();

            while (!(mathOp.equals("+") || mathOp.equals("-") || mathOp.equals("*") || mathOp.equals("/"))) {
                System.out.println("please reenter!");
                mathOp = s.next();
            }
            System.out.println("Enter second number");
            int n2 = s.nextInt();

            if (mathOp.equals("+")) {
                result = n1 + n2;
            } else if (mathOp.equals("-")) {
                result = n1 - n2;
            } else if (mathOp.equals("*")) {
                result = n1 * n2;
            } else if (mathOp.equals("/")) {
                result = n1 / n2;
            } else {

            }
            System.out.println(result);
            System.out.println("Would like to continue with using Cydeo Calculator>>>? 'Yes'/'No'");
            String ans = s.next();
            while (!((ans.equals("yes")) || (ans.equals("no")))) {
                System.out.println("Invalid entry- Please-re-enter");
                ans = s.next();
            }
            if (ans.equals("no")) {
                System.out.println("Thank You for using Cydeo Calculator.Bye! ");
                break;
            }
        }

    }
}