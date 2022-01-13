package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        //to string
        int[] nums={1,2,3,4,5};

        System.out.println(nums);//hashcode
        System.out.println(Arrays.toString(nums)); //"{1,2,3,4,5}"

        //sort
        int[] scores= {95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);  //print the numbers from smallest to biggest
        System.out.println("min score: "+scores[0]);  //min num
        System.out.println("max score: "+scores[scores.length-1]);

        String [] names={"Gunay","Anna","Zuhal","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //equals(arr1,arr2)
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1); //{1,2,3}
        Arrays.sort(arr2);//{1,2,3}

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2);

        //copyOf
        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        numbers=Arrays.copyOf(numbers,5);//always copy from first element to given number
        System.out.println(Arrays.toString(numbers));


        //copyOfRange
        char[] ch1={'A','B','C','D','E','F','G'};
        char[] ch2=Arrays.copyOfRange(ch1,2,6); //(Array,beginningIndex ,endingIndex)
        System.out.println(Arrays.toString(ch2));


        int[] scores1={10,20,30,40,50,60,70,80,90,100};
        int[] result= Arrays.copyOfRange(scores1,3,7); //(Array,beginningIndex ,endingIndex)
        System.out.println(Arrays.toString(result));

        int[] result1=Arrays.copyOfRange(scores1,3,scores1.length);//(Array,beginningIndex ,endingIndex)
        System.out.println(Arrays.toString(result1));


    }
}
