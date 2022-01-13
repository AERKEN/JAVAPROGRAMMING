package Practice;

import java.util.Scanner;

public class Unit1_ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
String sport="";
        boolean isTall= scan.nextBoolean();
        boolean isFast= scan.nextBoolean();
        boolean isFlexible= scan.nextBoolean();

        if (isFast){
            sport="basketball";
        }else if (isFlexible){
            sport="gymnastics";
        }else{
            sport="vollyball";
        }
        if (isFast){
            sport="soccer";
        }else{
            sport="tennis";
        }
        System.out.println(sport);


    }
}
