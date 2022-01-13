package Practice;

import java.util.Scanner;

public class Aword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();

        if (word.charAt(0)>=48&&word.charAt(0)<=57){
            System.out.println("first character is digit");
        }else if(word.charAt(0)>=65&&word.charAt(0)<=90){
            System.out.println("first character is uppercase letter");
        }else if(word.charAt(0)>=100&&word.charAt(0)<=132){
            System.out.println("first character is lowercase letter");
        }else{
            System.out.println("first character is special character");
        }

    }
    }

