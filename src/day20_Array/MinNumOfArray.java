package day20_Array;

public class MinNumOfArray {
    public static void main(String[] args) {

        int[]numbers={100,500,30,40,600,80,-90};
        int min=numbers[0]; //100

        for (int i = 0; i < numbers.length; i++) { //i:0,1,2,3,4,5....

            if (numbers[i]<min){  //if element number smaller than current index number
                min=numbers[i];  //then assign it to the variable min
            }

        }
        System.out.println(min);








    }
}
