package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Moon","German",'F',2,"Large","white");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Moon","Van",'F',1,"Medium","White");
        System.out.println(cat1);
        cat1.scratch();
        cat1.sleep();


        Tiger tiger1 = new Tiger("Tiger","Tiger",'M',3,"Huge","Yellow");
        System.out.println(tiger1);
        tiger1.hunt();
        tiger1.roar();


    }

}

