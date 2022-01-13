package Practice;

import java.util.Arrays;

public class Classmate_Array {
    public static void main(String[] args) {

        String[]classmate={"Gulsen sohret","Sibel sohret","suret sohret","Alpha sohret","Alper sohret"};
        String initial="";
        for (int i = 0; i < classmate.length; i++) {
            initial+=classmate[i]+"\n";

        }
        System.out.print(initial);

        System.out.println("___________________________________");


        String[]classmates={"Gulsen sohret","Sibel sohret","suret sohret","Alpha sohret","Alper sohret"};
        for (int i = 0; i < classmates.length; i++) {
            String reversed="";
            for (int j = classmates[i].length(); j > 0; j--) {
                reversed += ""+classmates[i].charAt(j-1);
            }
            System.out.println(reversed);
        }



    }
}
