package Practice;

import java.util.Scanner;

class LoopPoAndNegative {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int pos=0;
        int nag=0;
        for (int i=0; i<5;i++){    // put loop inside the scanner, tell scanner the
        System.out.println("Enter a number");
            int num= scan.nextInt();

            if (num>0){
                pos++;
            }else{
                nag++;
            }
        }
        System.out.println(pos+" positive and "+nag+" negative");





    }
}
