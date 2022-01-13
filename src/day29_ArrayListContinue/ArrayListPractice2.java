package day29_ArrayListContinue;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David") );

        System.out.println(employees);

        System.out.println("--------------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        //convert array to arrayList

        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.startsWith("M"));  //or p.charAt(0)=='M'

        System.out.println(list);


        //convert to array
        names=list.toArray(new String[0]);  //assign to new String array
        System.out.println(Arrays.toString(names));




    }








    }

