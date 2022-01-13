package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        // display the numbers between 15-45, in the same line separate with space

        for (int i=15; i<=45; i++){

            System.out.print(i+" ");   // do not use println for same line

        }
        System.out.println("\nHello");  //or add an empty print statement for the new line

        System.out.println("_______________________________________________");
         // backward     common operator (>=,<=, >, <)
        for (int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println("\n______________________________________________");
        for (int i=1; i<=55;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }




    }
}
