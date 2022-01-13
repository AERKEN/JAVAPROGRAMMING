package costomMethodTasks;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class MixTasks {
    public static void main(String[] args) {
        posNegOrZero(50);
        printEachChar("I am smart");
        printEachElement(new int[]{8, 9, 10, 11, 12});
        calculator(30, 20, '+');

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        fullName(firstName, lastName);
        anagram("silent", "listen");

    }

    public static void posNegOrZero(int num) {

        if (num > 0) {
            System.out.println(num + " is integer");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num);
        }
    }

    public static void printEachChar(String sen) {

        for (int i = 0; i < sen.length(); i++) {
            char each = sen.charAt(i);
            System.out.print(each + " ");
        }
    }

    public static void printEachElement(int[] numbers) {

        for (int each : numbers) {
            System.out.print(each + " ");

        }
    }

    public static void calculator(int num1, int num2, char mathOperator) {

        int result = 0;
        switch (mathOperator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                result = num1 / num2;
        }
        System.out.println("Result= " + result);
    }

    public static void fullName(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);
    }

    public static void anagram(String word1, String word2) {

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println(word1 + " and " + word2 + " are anagram");
        }
    }
}