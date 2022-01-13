package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12"+1); //121
        System.out.println(10+20);  //30
        System.out.println(100-50);  //50
        System.out.println(10*5);    //50
        System.out.println(100/3.0);  //33.33333

          int a=100;
          double b= a/6;     //integer16
        double c = (double)a/6; // get decimal 16.6666
        double c1= a/6.0;       // get decimal 16.6666
        double c2= a/6d;        // get decimal 16.66666
    }


}
