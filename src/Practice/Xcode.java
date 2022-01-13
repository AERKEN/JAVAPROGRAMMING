package Practice;

import java.util.Scanner;

public class Xcode {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String w= scan.next();

        System.out.println(w.replaceFirst("x",""));
    }
}
