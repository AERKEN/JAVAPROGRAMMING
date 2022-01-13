package day08;

public class NameOfTheDays {
    public static void main(String[] args) {
        int number= 5 ;
        boolean monday= number==1;
        boolean tuesday= number==2;
        boolean wednesday= number==3;
        boolean thursday= number==4;
        boolean friday= number==5;
        boolean saturday= number==6;
        boolean sunday= number==7;
        if (monday){
            System.out.println("monday");
        }
        if (tuesday){
            System.out.println("tuesday");
        }
        if (wednesday){
            System.out.println("wednesday");
        }
        if (thursday) {
            System.out.println("thursday");
        }
        if (friday) {
            System.out.println("friday");
        }
        if (saturday) {
            System.out.println("saturday");
        }
        if (sunday) {
            System.out.println("sunday");
        }
        System.out.println("-------------------------------------------------------");
        //multi branch if
        int n=5;
        if (n==1) {
            System.out.println("monday");
        }else if(n==2) {
            System.out.println("tuesday");
        }else if (n==3) {
            System.out.println("wednesday");
        }else if(n==4) {
            System.out.println("thursday");
        }else if(n==5) {
            System.out.println("friday");
        }else if (n==6) {
            System.out.println("saturday");
        }else{
            System.out.println("invalid");
        }

    }

}
