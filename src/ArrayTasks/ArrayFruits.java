package ArrayTasks;

import java.util.Arrays;

public class ArrayFruits {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},  //arr0
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, //arr1
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}   //arr2
        };

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print (items[i][j]+"\t");
            } System.out.println();
        }


        for (int i1 = 0; i1 <items.length; i1++) {
            for (int j1 = items[i1].length - 1; j1 >= 0; j1--) {
                System.out.print(items[i1][j1]+"\t");
            }System.out.println();
        }


        for (int i2 = items.length-1; i2 >= 0; i2--) {
            for (int j2 = 0; j2 < items[j2].length; j2++) {
                System.out.print(items[i2][j2]+"\t");

            }System.out.println();

        }

    }
}
