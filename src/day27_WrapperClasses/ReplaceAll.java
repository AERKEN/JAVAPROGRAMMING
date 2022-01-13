package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {

        int[]arr1={10,20,30,40,30,60,30};
        arr1=replaceAll(arr1,30,300);
        System.out.println(Arrays.toString(arr1));
    }


//replace all the matching old value of the array to the new value
    public static int[] replaceAll(int[]array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
               array[i]= newValue;
            }

        }return array;
    }

    //replace all the matching old value of the array to the new value
    public static double[] replaceAll(double[]array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]= newValue;
            }

        }return array;
    }


    //replace all the matching old value of the array to the new value
    public static char[] replaceAll(char[]array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]= newValue;
            }

        }return array;
    }


    //replace all the matching old value of the array to the new value
    public static String[] replaceAll(String[]array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i]= newValue;
            }

        }return array;
    }
}
