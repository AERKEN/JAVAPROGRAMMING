package day18_NestedLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i <j+1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }













    }
}
/*
Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */