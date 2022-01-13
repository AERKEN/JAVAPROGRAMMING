package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n=3;

        for (int i = 1; i < 3; i++) {     //loop will check another max num depends on n'

            list.removeIf(p -> Collections.max(list) == p);  //remove each max during loop

        }

       int max= Collections.max(list);  //always find the first max num
        System.out.println(max);






    }
}
