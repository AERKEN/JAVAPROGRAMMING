package day25_CostomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {


        String str="Java programming Language";

        StringUtility.printEchChar(str);
        System.out.println("____________________________");

        String s1="Wooden Spoon";
        String reversed=StringUtility.reverse(s1);
        System.out.println(reversed);
        System.out.println("____________________________");

        String s2="Civic";
        boolean isPalindrome=StringUtility.isPalindrome(s2);
        System.out.println(isPalindrome);

        String[] names={"Anna","Java","Python"};
        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        String s3="aaabbbbbbbrrrrkkklll";
        String removed=StringUtility.removeDuplicates(s3);
        System.out.println(removed);



    }

}
