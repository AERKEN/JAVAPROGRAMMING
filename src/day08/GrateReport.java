package day08;

public class GrateReport {
    public static void main(String[] args) {
        int score= 85;
        boolean excellent = score >=90 && score<=100; //false
        boolean great = score >= 80 && score<=90; //true // or !excellent for right side
        boolean good = !excellent && !great && score>=79; //
        boolean passed = !excellent&&!great&&!good;//
        if(excellent){
            System.out.println("excellent");
        }
        if(great){
            System.out.println("great");
        }
        if (good){
            System.out.println("good");
        }
        if (passed){
            System.out.println(passed);
        }
    }






}
