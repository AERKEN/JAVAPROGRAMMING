package Practice;

public class GradeLevel {
    public static void main(String[] args) {

        byte level= 5;
        String school="";

        if (level>0 || level<18){

            if (level<=5){
                school="elementary";
            }else if (level>=6 && level<=8){
                school="middle";
            }else if (level>=9 || level<12){
                school= "high school";
            }else if (level>12&& level<16){
                school="college";
            }else {
                school="grade";
            }

        }else{
            System.out.println("invalid");
        }
        System.out.println(school);

        System.out.println("__________________________________________");
        //Ternaries


        String school2=(level>0 || level<18)? (level<=5)?"elementary":(level>=6 && level<=8)?"middle"
                :(level>=9 || level<12)?"high school":(level>12&& level<16)?"college"
                :"grade":"invalid";
        System.out.println(school2);
















    }
}
