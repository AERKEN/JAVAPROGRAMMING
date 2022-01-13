package Practice;

import java.util.Arrays;

public class Reverse1_Array {
    public static void main(String[] args) {

   int[] array={1,2,3,4,5};

        for (int i = array.length-1; i >=0; i--) {

            System.out.print(array[i]+" ");
        }
    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */