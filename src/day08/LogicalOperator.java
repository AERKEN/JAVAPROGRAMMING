package day08;

public class LogicalOperator {
    public static void main(String[] args) {
        int age=19;
        String citizen= "Uk",
                name="Steven";
        boolean IsEligible= age>=18 && citizen=="USA";
        System.out.println("IsEligible = " + IsEligible);

        String name2= "Josh";
        int creditScore= 720, age2=23, income=40000;

        boolean IsEligible2= creditScore>=720 && age2>=21 && income<=100000;
        System.out.println("IsEligible2 = " + IsEligible2);

        String name3 = "Shay";
        int age3=21; char gender= 'F';
        boolean IsEligible3= age3>=18 && (gender=='F'|| gender=='M');
                         //  true     &&    true   or   false ( right side one of them is true)
                         //  true     &&    true

        String name4="James", countryOfBirth= "UK";
        boolean marriedToUSCitizen= false;
        boolean IsEligibale= countryOfBirth=="USA" || marriedToUSCitizen==true;

        String student= "Anna";
        double gpa=3.5;
        int familyIncome = 100000;
        boolean isEligible5= gpa>=3.5 || familyIncome<=600000;
        System.out.println("isEligible5 = " + isEligible5);


    }
}
