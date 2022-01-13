package day20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        //creat a variable that capable 5 name

        String[] myGroup=new String[6];
        myGroup[0]="farya";
        myGroup[1]="gulsen";
        myGroup[2]="suret";
        myGroup[3]="sibel";
        myGroup[4]="Alpha";
        myGroup[5]="Alper";

        //System.out.println(myGroup);  //will give hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("______________________________________");


        System.out.println("_____________________________________");

        String[]month={"Jan","Fab","March","Ap","May","June","July","AG","Sep","Oc","Nov","Dec"};
        System.out.println(Arrays.toString(month));
        int num1=7;

        if (num1<0||num1>12){
            System.out.println("invalid");
            System.exit(0);
        }
        System.out.println(month[num1]);

    }
}
