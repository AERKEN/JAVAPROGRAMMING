package day20_Array;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num= new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number:");
            num[i]=s.nextInt();  //each user enter input assigned to the indexes of the array num

        }
        int max=num[0];
        int min=num[0];
        for (int i = 0; i < num.length; i++) {

            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);




    }
}
