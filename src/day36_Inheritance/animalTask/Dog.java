package day36_Inheritance.animalTask;


public class Dog extends Animal  { //Dog Is An animal
    //      child        parent


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }


}

/*
    dog:
        6 variables
        6 methods

 */







