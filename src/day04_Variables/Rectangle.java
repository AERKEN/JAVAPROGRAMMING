package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        int length = 10;
        double width = 5.5;

        double area = length * width;
        double perimiter = 2 * (length+width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimiter = " + perimiter);
    }
}
