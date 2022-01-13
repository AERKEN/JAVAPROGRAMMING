package day_09IfStatement;

public class LeapYear {
    public static void main(String[] args) {
        int year=2020;
        boolean leapYear= year%4==0;
        if (leapYear) {
            System.out.println("year " + year + " is the leap year");
        }else{ System.out.println("year "+year+" is not leap year");
        }
    }
}
