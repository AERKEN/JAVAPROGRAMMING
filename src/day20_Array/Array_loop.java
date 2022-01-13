package day20_Array;

import java.util.Arrays;

public class Array_loop {
    public static void main(String[] args) {

        char[] letters=new char[26];
        //get the index number and char
     char ch='A';
        for (int i=0;i<letters.length;i++ ,ch++){
            letters[i]=ch;

        }


        System.out.println(Arrays.toString(letters));

    }
}
