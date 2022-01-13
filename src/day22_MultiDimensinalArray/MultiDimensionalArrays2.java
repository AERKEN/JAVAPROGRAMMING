package day22_MultiDimensinalArray;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };



        for (int i = arr2D.length - 1; i >= 0; i--) {   //i: index of 1D arrays starting from last index

            for (int j = 0; j < arr2D[i].length; j++) {  //j:index of element starting from 0

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();

            }
        System.out.println("________________________________________________________");

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println("_____________________________________________________________");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();

        }


        }






    }

