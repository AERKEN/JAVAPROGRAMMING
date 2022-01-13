package day20_Array;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int sum=0; //10+20+30...
        int[]num={10,20,30,40,50,60};

        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }
        double average=sum/ num.length;
        System.out.println(average);


    }
}
