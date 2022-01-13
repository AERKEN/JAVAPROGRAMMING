package day17_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }
            System.out.println("___________________________________");

            //print all odd numbers

            for (int j = 0; j < 11; j++) {

                if(j%2==0){
                    continue;
                }
                System.out.println(j);

            }
        System.out.println("_____________________________________");
        //print all even numbers

        for (int j = 0; j < 11; j++) {

            if(j%2!=0){
                continue;
            }
            System.out.println(j);

        }




    }
}
