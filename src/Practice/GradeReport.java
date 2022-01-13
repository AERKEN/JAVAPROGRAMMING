package Practice;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Enter your score: ");
        int score = input.nextInt();
        String result ;

        if (score >= 0 && score <= 100){

            result = (score >= 90)? "Your grade is A" :(score >= 80)? "Your grade is B"
                    :(score >= 70)? "Your grade is C"
                    :(score >= 60)? "Your grade is D" : "Your grade is F";

        }else{
            result = ("Invalid score");
        }
        System.out.println(result);

        input.close();

    }
}