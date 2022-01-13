package Practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter cents");
        int cents=input.nextInt();

        System.out.println(cents+" cents equal to: "+(cents/100)+" dollars and "+(cents%100)+" cents");

        input.close();

    }
}
