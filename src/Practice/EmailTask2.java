package Practice;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your Email");
        String email= scan.nextLine();


        String firstName= email.substring(0,email.indexOf('_'));
        String lastName=email.substring(email.indexOf('_')+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));

        String upCase=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String lowCase=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println("First name:"+upCase);
        System.out.println("Last name:"+lowCase);
        System.out.println("Domain:"+domain);


        }
    }

