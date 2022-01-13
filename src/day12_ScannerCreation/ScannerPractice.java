package day12_ScannerCreation;


import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name ");
        int num=scan.nextInt();
        String result="";

        if(num>=1 && num<=7){
           result= (num==1)?"monday":(num==2)?"tuesday":(num==3)?"wednesday":(num==4)?"thursday"
                    :(num==5)?"friday":(num==6)?"saturday":"sunday";
        }else{
            result="invalid";
        }
        System.out.println(result);

        scan.close();


        
    }





}
