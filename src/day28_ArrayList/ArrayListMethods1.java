package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        //adds the data after last index of array list
        numbers.add(10); //index 0
        numbers.add(20); //index 1
        numbers.add(30);  //index 2
        numbers.add(40);  //index 3

        //inserts a new data to the specific index number
        numbers.add(2,50);
        numbers.add(1,45);
        System.out.println(numbers);

        //print the total number of element  //6
        System.out.println(numbers.size());

        //print the last index number  //5
        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);


        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i) );
        }

        System.out.println("----------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);


        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove( employees.size() -1 );

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);




    }
}
