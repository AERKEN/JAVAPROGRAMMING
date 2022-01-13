package day36_Inheritance.homeWork;

public class Iphone extends Phone{


    public void faceTime(long phoneNum){
        System.out.println(brand+model+phoneNum+" is calling face time");
    }

    public void faceTime(String email){
        System.out.println(email+" is calling face time to"+model+size+"Iphone");
    }







}
