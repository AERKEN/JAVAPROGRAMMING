package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int age = 29;

        // for if&else block        ? is if  : is else
        String result1 = (age >= 21) ? "Eligible" : "Not Eligible";
        System.out.println((age >= 21) ? "Eligible" : "Not Eligible");



        // for else if block
        int num = 100;
        String result2 = (num > 0) ? "Pos" : (num < 0) ? "Nag" : "zero";

        System.out.println(result2);


        // Name of mo2 // else if  ()?"":()?""
        int n= 5;

        String mo=(n==1)?"Jan":(n==2)?"Fab" :(n==3)?"March":(n==4)?"April":(n==5)?"May"
                :(n==6)?"June" :(n==7)?"July":"Aug";
        System.out.println(mo);


        // for nested if

        int s=85;
        if (s>=0 && s<=100) {

            if (s >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        }else{
            System.out.println("invalid");


            String result3= (s>=0 && s<=100)? (s >= 60)?"passed":"failed":"invalid";
            System.out.println(result3);



        }




















    }






}
