package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Do you want a room?");
        String ans = s.next().toLowerCase();

        while (!(ans.equals("yes") || ans.equals("no"))) {
            System.out.println("Please reenter!");
            ans = s.next().toLowerCase();
        }
        if (ans.equals("no")) {
            System.out.println("Have a nice day!");
        } else {
        }
        while (true) {
            System.out.println("Please Choose a room :\n1.King bed\n2.Queen bed\n3.single bed");
            String room = s.next();
            while (!(room.equalsIgnoreCase("1") || room.equalsIgnoreCase("2")
                    || room.equalsIgnoreCase("3"))) {
                System.out.println("Invalid answer");
                room = s.next();

            }
            System.out.println("How many nights you want to stay?");
            int night = s.nextInt();

            System.out.println("Would you like to reserve another room?");
            ans = s.next();
            while (!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))) {
                System.out.println("Please re enter!");
                ans = s.next();
                int total = 0;
                if (ans.equalsIgnoreCase("yes")) {
                }

                if (ans.equalsIgnoreCase("no")) {
                    if (ans.equalsIgnoreCase("1")) {
                        total = 120;
                    } else if (ans.equalsIgnoreCase("2")) {
                        total = 100;
                    } else {
                        total = 80;

                    }

                }
                System.out.println("Your total is: " + total * night);
            }


        }
    }
}



