package practice_12_08;

public class SwitchEx {
    public static void main(String[] args) {

        String animal="CAT";
        String res="";

        switch (animal){
            case "DOG": case "CAT":
                res="domestic animal";
                break;
            case "TIGER":
                res="wild animal";
                break;
            default:
                res="UNKOWN ANIMAL";
                break;
        }
        System.out.println(res);




    }
}
/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */