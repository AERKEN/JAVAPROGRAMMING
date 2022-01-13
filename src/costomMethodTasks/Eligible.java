package costomMethodTasks;

public class Eligible {
    public static void main(String[] args) {
        alcohol(21);
        vote(19,"USA");

    }
    public static void alcohol(int age){
        if (age>=21){
            System.out.println("You are eligible to buy alcohol");
        }

    }
    public static void vote(int age,String citizenship){

        if (age>18) {
            if (citizenship == "USA") {
                System.out.println("Eligible to vote");
            }
        }
    }
}
