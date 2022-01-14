package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {


        int[] array={1,2,3,4,5,6};

        int[] result=new int[array.length];  //{6,5,4,3,2,1}

         int j=0;  // index number of new array

        for (int i = array.length - 1; i >= 0; i--,j++) {   //j: index number will increase for new array

           result[j]= array[i];

        }

        System.out.println(Arrays.toString(result));

        System.out.println("________________________________________");










        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reverseList=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            reverseList.add(list.get(i));

        }
        System.out.println(reverseList);


    }
}
