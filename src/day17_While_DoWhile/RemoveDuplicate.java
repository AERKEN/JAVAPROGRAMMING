package day17_While_DoWhile;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str="AAVVFFDD";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            String ch=""+str.charAt(i);      //"A","A","B","B",

            if (result.contains(ch)){  //if the result already contains the character
                continue;             //skips
            }
            result+=ch;
        } System.out.println(result);
        System.out.println("__________________________________");

        Scanner in=new Scanner(System.in);



    }



}
