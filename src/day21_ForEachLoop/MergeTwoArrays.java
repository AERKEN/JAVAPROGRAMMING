package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1={"Farya","Gulsen","Ali",};//3
        String[] group2={"Gulsen","Ali",};            //2array

        String[] students=new String[group1.length+group2.length]; //to make sure the new array has enough capacity to contain previes arrays

        int i=0;
        for (String each:group1){
            students[i++]=each;
        }

        for (String each:group2){
            students[i++]=each;
        }

        System.out.println(Arrays.toString(students));
        System.out.println("_________________________________________");

        char[] ch1={'A','B','C','D'};
        char[] ch2={'A','B','C','D','J','K'};
        char[] ch3=new char[ch1.length+ch2.length];// definition of merge

        int j=0;

        for (char each:ch1){
            ch3[j++]=each;
        }
        for (char each:ch2){
            ch3[j++]=each;
        }
        System.out.println(Arrays.toString(ch3));
    }
}
