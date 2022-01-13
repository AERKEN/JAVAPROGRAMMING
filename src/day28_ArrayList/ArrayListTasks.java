package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));
        numbers.set(numbers.size()-1,0 );
        System.out.println(numbers);
        System.out.println("__________________________________________");

        ArrayList<Integer> num=new ArrayList<>();

        num.addAll(Arrays.asList(1,2,3,4,5));
        int temp=num.get(0);
        num.set(0,num.get(num.size()-1));
        num.set(num.size()-1,temp);
        System.out.println(num);

        System.out.println("_______________________________________________");

        ArrayList<Integer> odd=new ArrayList<>();

        odd.addAll(Arrays.asList(1,2,3,4,5));

        for (int i=0;i< odd.size();i++){

            if (odd.get(i)%2!=0){
                odd.set(i, odd.get(i)*2);
            }
        }
        System.out.println(odd);

        System.out.println("__________________________________________________");
 
        ArrayList<String> list=new ArrayList<>();

        String[] s1={"A","B","C","D"};
        String[] s2={"E","F","G"};

        for (String each:s1){
            list.add(each);
        }

        for (String each:s2){
             list.add(each);
        }

        System.out.println(list);

        System.out.println("________________________________________________________");


        ArrayList<Integer> num1= new ArrayList<>();

        num1.addAll(Arrays.asList(1,2,3,4,5));

        int max=num1.get(0);

        for (int each:num1){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);




        ArrayList<Integer> num2= new ArrayList<>();

        num2.addAll(Arrays.asList(1,2,3,4,5));

        int min=num2.get(0);

        for (int each:num2){

            if (each<min){
                min=each;
            }
        }

        System.out.println(min);


        ArrayList<Integer> num3= new ArrayList<>();
        num3.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));





    }
}
