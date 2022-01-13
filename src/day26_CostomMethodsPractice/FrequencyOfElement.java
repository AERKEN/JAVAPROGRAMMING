package day26_CostomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,1,1,11,1,1,4,5,3,6};
       int n= frequencyOfElement(arr,1);
        System.out.println(n);

    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count=0;

        for (int each:array){
            if (each==element){
                count++;
            }
        }

        return count;
    }




    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count=0;

        for (double each:array){
            if (each==element){
                count++;
            }
        }

        return count;
    }




    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count=0;

        for (char each:array){
            if (each==element){
                count++;
            }
        }

        return count;
    }






    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
       int count=0;

        for (String each:array){
            if (each.equals(element)){
                count++;
            }
        }

        return count;
    }
}


