package day08;

public class NumberOfDays {
    public static void main(String[] args) {
        int number=5;
        boolean has28Days= number==2;
        boolean has30Days= number==4||number==6||number==9||number==11;//for the month that has 30 days
        boolean has31Days= !has30Days && !has28Days ;

        if (has28Days){
            System.out.println("28 Days");
        }
        if (has30Days){
            System.out.println("30 Days");
        }
        if (has31Days){
            System.out.println("31 Days");
        }
    }
}
