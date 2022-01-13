package Practice;

import java.util.Scanner;

public class Ppleanana {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.next();

        System.out.println("Enter second word");
        String word1= input.next();

        String r1=word.substring(1)+word1.substring(1);

        System.out.println(r1);

    }
}
