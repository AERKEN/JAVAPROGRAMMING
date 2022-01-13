package Practice;

public class AgeGroups {
    public static void main(String[] args) {
        int age=35; String groups;

        if (age<3){
            groups="infant";
        }else if (age>2 && age<6){
            groups="toddler";
        }else if (age>=6 && age<=9){
            groups="kid";
        }else if (age==10 && age<=12){
            groups="pre-teen";
        }else if (age>12 && age<=17){
            groups="teenager";
        }else if (age==18 && age<=20){
            groups="young adult";
        }else if (age>20 || age==39){
            groups="adult";
        }else if (age>=40 && age<49){
            groups="youge Middle-Age Adult";
        }else if (age>=49 && age<55){
            groups="Middle-Aged Adult";
        }else {
            groups = "Very young senior citizen";
        }
        System.out.println(groups);
    }
}
