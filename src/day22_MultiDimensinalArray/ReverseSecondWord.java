package day22_MultiDimensinalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sen = "I love Java";
        String[] word = sen.split(" ");
        String rev = "";

        for (int i = word[1].length() - 1; i >= 0; i--) {
            rev += word[1].charAt(i);

        }
        System.out.println(rev);

        word[1] = rev;
        System.out.println(Arrays.toString(word));

String res="";
        for (String each:word){
           res+= each+" ";

        }
        System.out.println(res);

    }
}
