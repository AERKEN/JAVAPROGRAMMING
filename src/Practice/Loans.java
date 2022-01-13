package Practice;

public class Loans {
    public static void main(String[] args) {

        int salary= 50000, creditScore=650;
        String result="";

        String result1=(salary>=50000&& creditScore>=650)?"loan Approved":"loan denied";
        System.out.println(result1);


    }
}
