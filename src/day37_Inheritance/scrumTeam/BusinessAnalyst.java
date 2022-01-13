package day37_Inheritance.scrumTeam;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "BA", id, salary, companyName);
    }



    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }
}
