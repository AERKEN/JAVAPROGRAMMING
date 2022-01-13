package Practice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int speedLimit=55;
        String result="";

        System.out.println("Enter your current speed");
        int currentSpeed= input.nextInt();

        int overSpeed = currentSpeed - speedLimit;

        if (currentSpeed>speedLimit) {
            result = (" your driving " + overSpeed + "mph over the limit. Slow down! ");
        }else{
            result="";

        }
        System.out.println(result);

        input.close();

    }
}
