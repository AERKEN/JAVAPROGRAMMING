package Practice;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sentence=scan.nextLine();
       sentence=sentence.toLowerCase();
       int fre=0;

        for (int i = 0; i < sentence.length()-4; i++) {

            if (sentence.substring(i,i+4).contains("java".toLowerCase())){
                fre++;
            }
        }
        System.out.println(fre);


    }
}
