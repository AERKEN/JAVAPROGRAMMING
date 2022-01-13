package day35_Encapsulation.encapsulation;

public class Square {


    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if (side < 0) {
            return;
        }
        this.side = side;
    }


    public double calculateArea() {

        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                "Area=" + calculateArea() +
                "Perimeter=" + calculatePerimeter() +
                '}';

    }
}