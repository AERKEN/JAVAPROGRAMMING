package day25_CostomMethods_Overloading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        array = addElement(array, 5);     //assigned back
        System.out.println(Arrays.toString(array));  // to get array result
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addElement(arr2, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println(Arrays.toString(arr2));
        System.out.println("__________________________________________________");




    }

    public static int[] addElement(int[] arr, int num) {
        int[] result = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


}