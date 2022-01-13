package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word=new Scanner(System.in).next();

        if (word.charAt(0)=='X'){
           word= word.replaceFirst("X","a");
        }
        System.out.println(word);
    }
}
