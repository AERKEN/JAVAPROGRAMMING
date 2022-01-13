package day08;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number=+200;
        boolean isPositiveNumber= number>0;
        boolean isNagitiveNumber=number<0;
        boolean zero= number==0;
        System.out.println(+number+" is Positive Number : " + isPositiveNumber);
        System.out.println(+number+" is Nagitive Number : " + isNagitiveNumber);
        System.out.println(+number+" is zero : " + zero);

        int number1=65;
        boolean divisibleBy2= number1%2==0;
        boolean divisibleBy3= number1%3==0;
        boolean divisibleBy5= number1%5==0;
        System.out.println(number1+" divisible by 2 : " + divisibleBy2);
        System.out.println(number1+" divisible by 3 : " + divisibleBy3);
        System.out.println(number1+" divisible by 5 : " + divisibleBy5);



    }
}
