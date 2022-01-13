package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1;  i<=10 ; i++) {
            System.out.println(i);

        }
        System.out.println("_--------------------------------------");
        int j=1;

        while (j<=10){
            System.out.println(j);
            j++;
        }
        System.out.println("____________________________________________");

        int k=1;

        do {
            System.out.println(k);
            k++;
        }while (k<=10);
    }
}
