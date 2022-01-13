package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=s.nextInt();

        while (!(age>=1||age<=120)){
            System.err.println("Invalid entry,");
            age=s.nextInt();
        }
        System.out.println("Are you a Us citizen? yes/no");
        String answer= s.next();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid entry,");
            answer=s.next().toLowerCase();
        }
        if (age>=18&&answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
