package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[]alpha=new char[26];  //Z,A

        char ch='Z';
       for (int i=0;i<alpha.length;i++,ch--){
           alpha[i]=ch;

       }

        System.out.println(Arrays.toString(alpha));



    }
}
