package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your user name");
        String u = s.next();
        System.out.println("Enter your user password");
        String p = s.next();

        if (u.equalsIgnoreCase("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");

        } else {
            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect user name or password");
                System.out.println("Enter your user name");
                u = s.next();
                System.out.println("Enter your user password");
                p = s.next();
                if (u.equalsIgnoreCase("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("loged in");
                    break;
                }
                if (!(u.equalsIgnoreCase("Cydeo") && p.equals("Cydeo123"))) {
                    System.out.println("locked");
                }


            }
        }
    }
}