package utilities;

public class MathUtility {
    public static void main(String[] args) {

        int sum1=sumOfTwoNumbers(10,20);
        System.out.println(sum1);
        double sum2=sumOfTwoNumbers(3.2,6.1);
        System.out.println(sum2);

        int sub=subOfTwoNumbers(50,20);
        System.out.println(sub);
        double sub2=subOfTwoNumbers(8.9,2.3);
        System.out.println(sub2);

        int multiplication=multiplicationOfTwo(5,9);
        System.out.println(multiplication);
        double multi=multiplicationOfTwo(3.3,9.1);
        System.out.println(multi);


        int div=divisionOfTwoDecimals(30,6);
        System.out.println(div);
        double division=divisionOfTwoDecimals(9.3,3.3);
        System.out.println(division);

        boolean even=evenNum(10);
        System.out.println(even);

        boolean oddNum=oddNum(9);
        System.out.println(oddNum);

        int max=maxOfTwoNum(2,7);
        System.out.println(max);
        double max1=maxOfTwoNum(2.2,4.4);
        System.out.println(max1);
        
        int min=minOfTwoNum(3,9);
        System.out.println(min);
       double min1=minOfTwoNum(2.2,9.9);
        System.out.println(min1);

        int square=squareOfNum(8);
        System.out.println(square);
        double square1=squareOfNum(5.5);
        System.out.println(square1);

        int cube=cubeOfNum(2);
        System.out.println(cube);
        double cube1=cubeOfNum(8.8);
        System.out.println(cube1);


    }



    public static int sumOfTwoNumbers(int n1,int n2){

        return n1+n2;

    }

    public static double sumOfTwoNumbers(double n1,double n2){

        return n1+n2;

    }


    public static int subOfTwoNumbers(int n1,int n2){

        return n1-n2;
    }

    public static double subOfTwoNumbers(double n1,double n2){

        return n1-n2;
    }



    public static int multiplicationOfTwo(int n1,int n2){

        return n1*n2;
    }

    public static double multiplicationOfTwo(double n1,double n2){

        return n1*n2;
    }



    public static int divisionOfTwoDecimals(int n1,int n2){

        return n1/n2;
    }

    public static double divisionOfTwoDecimals(double n1,double n2){

        return n1/n2;
    }


    public static boolean evenNum(int num){

        boolean even=false;
        if (num%2==0){
           even=true;
        }
        return even;
    }

    public static boolean oddNum(int num){

        boolean even=false;
        if (num%2!=0){
            even=true;
        }
        return even;
    }


    public static int maxOfTwoNum(int n1,int n2){
        int max=n2;
        if(n1>n2){
            max=n1;
        }
        return max;
    }


    public static double maxOfTwoNum(double n1,double n2){
        double max=n2;
        if(n1>n2){
            max=n1;
        }
        return max;
    }


    public static int minOfTwoNum(int n1,int n2){
        int min=n2;
        if(n1<n2){
            min=n1;
        }
        return min;
    }


    public static double minOfTwoNum(double n1,double n2){
        double min=n2;
        if(n1<n2){
            min=n1;
        }
        return min;
    }


    public static int squareOfNum(int num){

        return num*num;

    }

    public static double squareOfNum(double num){

        return num*num;

    }



    public static int cubeOfNum(int num){

        return num*num*num;

    }

    public static double cubeOfNum(double num){

        return num*num*num;

    }














}
