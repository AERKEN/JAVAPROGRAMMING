package Practice;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String size= "tall",   result="";

        switch (size){
            case "tall":
                result=size+" price is $3.69, calories are 90";
                break;
            case "grande":
                result=size+" price is $3.99, calories are 120";
              break;
            case "vent":
                result=size+" price is $4.29, calories are 150";
               break;
            default:
                result="invalid size";

        }
        System.out.println(result);
    }
}
