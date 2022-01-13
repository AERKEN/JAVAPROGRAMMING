package day25_CostomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4};
        ArraysUtility.printEachElementElement(arr1);
        System.out.println("________________________");

        double[] arr2={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("_________________________");

        char[] arr3={'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("__________________________");

        String[] arr4={"David","Elvira","Ali","Ignor"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("___________________________");

        int[] n1={4,3,7,6,9};

        int max1=ArraysUtility.max(n1);
        System.out.println(max1);
        System.out.println("___________________________");

        double[] n2={1.4,6.7,3.2,8.8};
        double max2=ArraysUtility.max(n2);
        System.out.println(max2);


        System.out.println("___________________________");

        int[] a1={1,2,3,4,5};

        boolean r1=ArraysUtility.contains(a1,5);

        System.out.println("r1 = " + r1);















    }
}
