package Practice;

public class AgeGroups2 {
    public static void main(String[] args) {
        byte age= 60;
        String group="";

        if (age>=0 && age>150){

            if (age<21){
                group="Teenager";
            }else if (age<55) {
                group = "Adult";
            }else {
                group="Senior";
            }
        }else{
            group="invalid";
        }
        System.out.println(group);

    }
}
