package Practice;

import java.util.Arrays;

public class ReplaceNumbers_Array {
    public static void main(String[] args) {

        int[] oldA = {10, 0, 5, 0, 1, 0};
        int[] newA=new int[oldA.length];
        int version=0;

        for (int i = 0 ;i < oldA.length; i++) {

            if (oldA[i]!=0){
                newA[version]=oldA[i];
                version++;

            }

        }
        System.out.println(Arrays.toString(oldA));
        System.out.println(Arrays.toString(newA));




    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */