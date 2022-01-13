package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter text");
        String text= scan.nextLine();
        String reverse="";

        String isPalindrome ="level";


        for (int i =text.length()-1; i>=0; i--) {
            reverse += text.charAt(i);
        }
          if (text.equalsIgnoreCase(reverse)){
              System.out.println(text+ " is palindrome");
          }else{
              System.out.println(text+" is not palindrome");
          }




    }
}
