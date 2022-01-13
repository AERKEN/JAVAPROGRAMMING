package Practice;

import java.util.Scanner;

class GradeIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();


        String result = "";


        if(grade>=90){
            result = "excellent";
        }else if(grade>=70 && grade<=90){
            result = "good";
        }else if(grade>=60 && grade<70){
            result = "pass";
        }else{
            result = "fail";
        }

        System.out.println(result);





    }
}