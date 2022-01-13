package day35_Encapsulation;

public class CustomClass_Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numOfWings,numOfHead;

    public CustomClass_Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }


    static{

        planet="Earth";
        isHuman=true;
        hasNose=true;
        numOfHead=1;
        numOfWings=0;

    }


    public void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }


    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+ "is drinking"+drink);
    }

    public String toString() {
        return "CustomClass_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", is human=" + isHuman +
                ", has nose=" + hasNose +
                ", number of wings=" + numOfWings +
                ", number of head=" + numOfHead +
                '}';
    }
}
