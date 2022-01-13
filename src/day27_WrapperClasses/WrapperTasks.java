package day27_WrapperClasses;

import java.util.Arrays;

public class WrapperTasks {
    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50};
        arr1=insert(arr1,2,100);
        System.out.println(Arrays.toString(arr1));

        int[] arr2={10,20,30,40,50};
        arr2=swap(arr2,2,4);
        System.out.println(Arrays.toString(arr2));


    }

    public static int[] insert(int[]array,int index,int element){

        if (index<0||index> array.length-1){
            System.out.println("Invalid: "+index);
        }
        array[index]=element;
        return array;

    }


    public static int[] swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;


        return array;
    }


    public static double[] swap(double[] array,int i,int j){
        double temp=array[i];
        array[i]=array[j];
        array[j]=temp;


        return array;
    }

    public static char[] swap(char[] array,int i,int j){
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;


        return array;
    }

    public static String[] swap(String[] array,int i,int j){
        String temp=array[i];
        array[i]=array[j];
        array[j]=temp;


        return array;
    }






}
