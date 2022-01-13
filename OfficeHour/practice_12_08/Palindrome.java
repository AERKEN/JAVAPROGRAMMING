package practice_12_08;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=s.nextLine();
        String res="";

        for (int i=word.length()-1;i>=0;i--){
            res+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(res);

        System.out.println(isPalindrome);



    }
}

/*
                       Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

                       */