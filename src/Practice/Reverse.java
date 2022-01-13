package Practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter text");
        String text=scan.nextLine();

        String reverse="";    // contain the reverse version of str

        for (int i=text.length()-1; i>=0; i--){  //i: index numbers of str(starting last index to index 0)

            reverse+=text.charAt(i);  //+= is store the characters to the variable one by one
        }
        System.out.println(reverse);
        scan.close();



    }
}
