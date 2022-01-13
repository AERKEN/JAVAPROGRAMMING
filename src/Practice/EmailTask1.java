package Practice;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a email address");
        String email= scan.next();

        if(email.contains("_")){
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@"))
                    +"_"+email.substring(0,email.indexOf("_"))+email.substring(email.indexOf("@")));
        }else{
            System.out.println(email);
        }


    }
}
