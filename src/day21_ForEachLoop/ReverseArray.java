package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50}; //50,40,30,20,10

        int[] rev = new int[numbers.length]; //to make sure that new array has enough capacity to contain all the elements of first array

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            rev[j] = numbers[i];

        }

        System.out.println(Arrays.toString(rev));


    }
}










