package day20_Array;

public class MaxNumOfArray {
    public static void main(String[] args) {
        int[]numbers={10,5,4,20,1,0};
        int max=numbers[0]; //10

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){  //if there is element in the array thats greater than the current max num
                max=numbers[i];   //assigning greater num to variable max
            }

        }

        System.out.println(max);







    }
}
