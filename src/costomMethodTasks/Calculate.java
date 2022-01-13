package costomMethodTasks;

public class Calculate {
    public static void main(String[] args) {
        grades(85);
        circle(6);
        square(20);
        dollarToEuro(150);
        dollarToLira(7000);
        kgToLb(48);

    }
    public static void grades(int score){
       if (score>=90){
           System.out.println("your grade is A");
       }else if (score>=80&&score<90){
           System.out.println("your grade is B");
       }else if (score>=70&&score<80){
           System.out.println("your grade is C");
       }else{
           System.out.println("your grade is D");
       }
    }

    public static void circle(double radius){
        double area=radius*radius*3.14;
        System.out.println("Circle area is: "+area);
    }

    public static void square(double side){
        double area=side*side;
        System.out.println("Square area is: "+area);
    }
    public static void dollarToEuro(double dollar){
        double euro=0.89;
        double convert=dollar*euro;
        System.out.println(dollar+" is "+convert);
    }
    public static void dollarToLira(double dollar){
        double lira=13.78;
        double convert=dollar*lira;
        System.out.println(dollar+" is "+convert);
    }

    public static void kgToLb(double kg){

        System.out.println(kg+"kg is "+kg*2.205+"lb");
    }
}

