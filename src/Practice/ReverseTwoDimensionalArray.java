package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

        int[][] array={ {1,2,3}, {4,5,6}};

        for (int i = array.length - 1; i >= 0; i--) {   //index of array
            for (int j = array[i].length - 1; j >= 0; j--) {  //index of elements

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }










    }
}
