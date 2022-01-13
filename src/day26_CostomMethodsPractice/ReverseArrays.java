package day26_CostomMethodsPractice;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int[] reversed=reverse(arr);
        System.out.println(Arrays.toString(reversed));


    }


    public static int[] reverse(int[]array){

        int[]result=new int[array.length];

        for (int i=array.length-1,j=0; i>=0; i--,j++){    //j: index of new array

            result[j]=array[i];           //reversed index will contain to the new result j++
        }

        return result;


    }
}
