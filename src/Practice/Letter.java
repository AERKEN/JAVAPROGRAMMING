package Practice;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two word");
        String word1= scan.nextLine();
        String word2= scan.nextLine();

        if (word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }





    }





}
