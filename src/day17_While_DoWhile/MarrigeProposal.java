package day17_While_DoWhile;

import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class MarrigeProposal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Will you marry me ? yes/no");
        String answer=s.next().toLowerCase();

        while (!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("Invalid Entry ");
            answer=s.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("congrats!");
        }else{
            System.out.println("Next!");
        }
    }
}
