package Practice;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sen = "caT dog dogG cAt";
        String sentence= scan.nextLine();
        int dog=0, cat=0;

        for (int i=0; i<sentence.length()-3;i++) {
            if (sentence.substring(i, i + 3).contains("cat")) {
                cat++;
            } else if (sentence.substring(i, i + 3).contains("dog")) {
                dog++;
            }
        }
            if (cat==dog){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

    }
}
