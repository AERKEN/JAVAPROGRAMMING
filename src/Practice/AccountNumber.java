package Practice;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number");
        String num = scan.nextLine();

        if (num.charAt(0) == '2' && num.length() == '7') {
        }else if (num.charAt(0) == '5' && num.length() ==10){
            System.out.println("valid account number");
        } else {
            System.out.println("invalid account number");
        }
    }
}