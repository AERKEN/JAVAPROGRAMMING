package day17_While_DoWhile;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean a=false;

        while (a) {
            System.out.println("wooden spoon");  //not print, bc condition is false
        }
        do {
            System.out.println("wooden spoon");  //Do:will print even the condition is false
        }while (a);     //then will check the while condition
    }
}
