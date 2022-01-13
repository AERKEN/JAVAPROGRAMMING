package Practice;

import java.util.Scanner;

public class LoopTask2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int facNum= scan.nextInt();

        for (int i =1 ; i <5 ; i++) {
            facNum*=i;
        }
          System.out.println(facNum);
    }
}
