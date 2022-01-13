package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="Java";

        for (char each:str.toCharArray()){
            System.out.println(each);
        }
        System.out.println("_____________________________________");

       String sen="I love Java Programming Langue";
      String[] word=sen.split(" ");
        System.out.println(Arrays.toString(word));

        System.out.println("_________________________________");
        String email="farya8888@gmail.com";

       String[] res= email.split("@");
        System.out.println(Arrays.toString(res));

        System.out.println("______________________________________");

        String s="Today is nice day,Today is Monday,Today we learn Java";

        String[]s1=s.split(",");
        System.out.println(Arrays.toString(s1));




    }
}
