package Practice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= sca.nextLine();
        System.out.println("Enter a char");
        String c= sca.next();
        int fre=0;

        for (int i=0; i<s.length(); i++){


            if (c.equalsIgnoreCase(""+s.charAt(i))){
                fre++;
            }
        }
        System.out.println(fre);

    }
}
