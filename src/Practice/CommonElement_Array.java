package Practice;

import java.util.Arrays;

public class CommonElement_Array {
    public static void main(String[] args) {

       int[] arr1= {1,2,3,4,5};
       int[] arr2={4,5,6,7,8};
  // find common elements which is 4,5

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){     // if i ==j , that is common element
                    System.out.print(arr2[j]+" ");
                }
            }

            }
        }
}

