package day23_CostumMethod;

public class MethodPractice2 {
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

    }

    public static void main(String[] args) { // create the method independently outside the other method
        helloWorld5Times();
        System.out.println("_______________________________");
        helloCydeo5Times();
        System.out.println("_______________________________");
        evenNumbers();
    }
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }
    public static void evenNumbers(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.println(i);

        }
    }
}
