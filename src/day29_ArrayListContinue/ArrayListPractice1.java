package day29_ArrayListContinue;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {


        String[] countries= {"Japan","US","Turkey","Canada","United Kingdom"};

        //converting array to arrayList:
        AbstractList<String>list=new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p-> p.length()>=10);

        //converting arrayList back to array

       countries= list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));























    }
}
