package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int age = 25;
        boolean hasId = true;

        if (hasId) {  // if the person has id


            if (age >= 21) {      // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else {             // if the person less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        } else {
        }
        System.out.println("You must have an ID to buy alcohol");
    }
}