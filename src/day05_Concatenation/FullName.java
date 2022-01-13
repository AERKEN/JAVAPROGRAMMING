package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstname = "Aerken";
        String lastName = "Gulfire";
        String fullname = firstname + " " + lastName;
        String jobtitle = "SDET";
        String companyname = "Apple";
        int salary = 12000;

        System.out.println(fullname + " is " +jobtitle+ " works at " +companyname
                + " , and " +fullname+ " salary is $ " +salary+" .");

    }
}
