package day24_CostomMethods_Return;

import java.util.Arrays;

public class ReturnMethodsTasks {
    public static void main(String[] args) {
        String w="kkkgghhfflllsaaww";
        w=removeDuplicate(w);
        System.out.println(w);
        System.out.println("_________________________________");
        int[] a={4,5,6,7,8,9,10};
        int max=maxArray(a);
        System.out.println(max);
        System.out.println("_______________________________________");
        int[] b={20,30,40,50,60};
        int min=minArray(b);
        System.out.println(min);
        System.out.println("________________________________________");
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        String rev=reverseArray(arr);
        System.out.println(rev);
        System.out.println("_________________________________________");
        String[] arr1={"gulfi,erfan,nasibe,gulsan"};
        String[] arr2={"gulfi,erfan,nasibe,gulsan"};
        String arr3=mergeArrays(arr1,arr2);
        System.out.println(arr3);
    }
    public static String removeDuplicate(String w){
         String result="";
        for (int i = 0; i <w.length() ; i++) {
            char each=w.charAt(i);

            if (!result.contains(""+each)){
                result+=each;

            }

        }return result;

    }
    public static int maxArray(int []a){
        int max=a[0];

        for (int i = 0; i <a.length ; i++) {
            if (a[i]>i){
                max=a[i];
            }
        }return max;

    }
    public static int minArray(int []b){
        int min=b[0];

        for (int i = 0; i < b.length; i++) {
            if (b[i]<i){
                min=b[i];
            }
        }return min;
    }
    public static String reverseArray(int []arr){
        String rev="";

        for (int i = arr.length - 1; i >= 0; i--) {
            rev+=arr[i]+" ";

        }
          return rev;

    }
    public static String mergeArrays(String[]arr1 ,String[]arr2){

        String[] arr3=new String[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]+=" "+arr1[i];
        }
        for (int j = 0; j <arr2.length ; j++) {
            arr3[j]+=" "+arr2[j];

        }return Arrays.toString(arr3);
    }
}
