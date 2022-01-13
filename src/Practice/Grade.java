package Practice;

public class Grade {
    public static void main(String[] args) {
        char grade='B';
        String result="";

        if (grade=='B'||grade<'A'){

            if (grade=='A'){
                result="excellent";
            }else if (grade=='B'){
                result="great job";
            }else if (grade=='c'){
                result="good";
            }else if (grade=='D'){
                result="passed";
            }else {
                result="failed";
            }
        }else {
            System.out.println("invalid");
        }
        System.out.println(result);



        String result2=(grade=='B'||grade<'A')?(grade=='A')?"excellent":(grade=='B')?"great job"
                :(grade=='c')?"good":(grade=='D')?"passed":"failed":"invalid";

        System.out.println(result2);



    }
}
