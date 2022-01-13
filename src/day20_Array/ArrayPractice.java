package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length=s.nextInt();

        if (length<=0){
            System.err.println("invalid");
            System.exit(0);
        }

        int[]number=new int[length];

        for (int i=0; i<length; i++){
            System.out.println("Enter a number :");
            number[i]= s.nextInt();
        }


        System.out.println(Arrays.toString(number));
        s.close();




    }
}
