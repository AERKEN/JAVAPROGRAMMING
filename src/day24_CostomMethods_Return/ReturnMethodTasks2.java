package day24_CostomMethods_Return;

import java.util.Arrays;
import java.util.Locale;

public class ReturnMethodTasks2 {
    public static void main(String[] args) {

        String sen = "Java java java python python";
        String word = "java";
        int fre = frequencyOfWord(sen, word);
        System.out.println(fre);
        System.out.println();
        String a = "abc";
        String b = "bac";
        boolean anagram = anagram(a, b);
        System.out.println(anagram);

        String reverse = reverse("Java");
        System.out.println(reverse);
        System.out.println("__________________________________________");

        boolean isPalindrome=palindrome("Level");
        System.out.println(isPalindrome);


        int[] numbers={1,1,1,1,1,2,2};
        int num= 1;
        int frequency=frequencyOfNum(numbers,num);
        System.out.println(frequency);


    }

    public static int frequencyOfWord(String sen, String word) {
        int fre = 0;

        for (int i = 0; i < sen.length() - word.length(); i++) {

            String each = sen.substring(i, i + word.length());

            if (each.toLowerCase().contains(word)) {
                fre++;
            }


        }
        return fre;
    }

    public static boolean anagram(String a, String b) {

        char[] ch1 = a.toCharArray();
        char[] ch2 = a.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);
        return anagram;
    }

    public static String reverse(String word) {
        String revere = "";

        for (int j = word.length() - 1; j >= 0; j--) {
            revere += word.charAt(j);


        }
        return revere;
    }
    public static boolean palindrome(String str){
        String reverse="";

        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        boolean isPalindrome=str.equalsIgnoreCase(reverse);
        return isPalindrome;
    }
    public static int frequencyOfNum(int[] numbers, int num){
       int fre=0;

        for (int i = 0; i <numbers.length ; i++) {
           if (numbers[i]==num){
               fre++;
           }
        }
        return fre;
    }
}