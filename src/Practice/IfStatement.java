package Practice;

public class IfStatement {
    public static void main(String[] args) {
        byte n1=18, n2=21;
        if (n1<n2) {
            System.out.println(n1 + " is minimum number");
        }else {
            System.out.println(n1+" is not minimum number");
        }
        if (n2>n1) {
            System.out.println(n2 + " is max number");
        }else{
            System.out.println(n2+" is not max number");
        }
        System.out.println("__________________________");
        byte age=21, age1=18;
        if (age>=21) {
            System.out.println(age + " is eligible for alchohol");
        }else {
            System.out.println(age + " is not eligible for alchohol");
        }
        if (age1==18) {
            System.out.println(age1 + "is eligible for vote");
        }else {
            System.out.println(age1 + " is eligible for vote");
        }


    }
}
