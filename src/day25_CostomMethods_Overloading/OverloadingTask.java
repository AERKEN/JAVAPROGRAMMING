package day25_CostomMethods_Overloading;

import java.util.Arrays;

public class OverloadingTask {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[]merged=merge(arr1,arr2);
        System.out.println(Arrays.toString(merged));
        System.out.println("_________________________________");
        double[] arr3={1.5,2.5,3.5};
        double[] arr4={1.5,2.5,3.5};
        double[]  merged1=merge(arr3,arr4);
        System.out.println(Arrays.toString(merged1));
        System.out.println("______________________________________");
        char[]arr5={'A','B','C'};
        char[]arr6={'D','E','F'};
        char[]merged2=merge(arr5,arr6);
        System.out.println(Arrays.toString(merged2));


    }

    public static int[] merge(int[]arr1,int[]arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int count=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[count]=arr2[i];
            count++;
        }

        return arr3;
    }
    public static double[] merge(double[]arr1,double[]arr2){
        double[] arr3=new double[arr1.length+arr2.length];
        int count=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr3[count]=arr1[i];
            count++;
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[count]=arr2[i];
            count++;
        }

        return arr3;
    }
    public static char[] merge(char[]arr1,char[]arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[count] = arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count] = arr2[i];
            count++;
        }

        return arr3;


    }}



 /*   Task3:
            1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

            2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)

  */


