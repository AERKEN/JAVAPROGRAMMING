package day23_CostumMethod;

public class CostomMethotWithParameter {
    public static void main(String[] args) {
        //oddOrEven();  //the method demands additional info to complete its task
        oddOrEven(10);
        ageOfPerson(1995);
        printNum(100,200);

    }
    public static void oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+"is even");
        }else{
            System.out.println(number+"is odd");
        }





    }

    // create a function that can display the age of a person
    public static void ageOfPerson(int birthYear){

        int age =2021-birthYear;

        System.out.println("Your age is"+age);





    }

    public static void printNum(int x,int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);

        }
    }
}
