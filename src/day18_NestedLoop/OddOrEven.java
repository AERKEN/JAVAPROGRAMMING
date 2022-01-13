package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + "is even num");
            } else {
                System.out.println(num + " is odd num");
            }
            System.out.println("would you like to an other number ");
            String a = scan.next().toLowerCase();
            while (!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
                System.err.println("Please reenter!");
                scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }
    }
}