package Practice;

import java.util.Scanner;

public class PeopleLiveWith {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("How many people you live with ");
        int people=input.nextInt();

        String result=(people<3)?"Live with less than 3 people":(people<=6)?"live with 3-6 people"
                :"Live with more than 6 people";

        System.out.println(result);

        input.close();





    }
}
