package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoop_Login {
    public static void main(String[] args) {

        // log in
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username");
        String UserName=scan.next();
        System.out.println("Enter Password");
        String password=scan.next();

        int attempt=3;

            while (!(UserName.equals("Cydeo")&& password.equals("Cydeo123"))&&attempt>0){
                if (attempt==1){
                    System.out.println("this is your last chance");
                }
            System.err.println("incorrect username or password");
            System.out.println("Enter username");
            UserName= scan.next();

            System.out.println("Enter Password");
            password=scan.next();
            attempt--;
        }
            if ((UserName.equals("Cydeo") && password.equals("Cydeo123") )){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");
            }
            scan.close();
    }
}
