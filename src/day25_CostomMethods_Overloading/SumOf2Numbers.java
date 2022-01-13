package day25_CostomMethods_Overloading;

public class SumOf2Numbers {
    public static void main(String[] args) {
        int sum=sumOf2Numbers(4,6);
        System.out.println(sum);
        int sum1=sumOf3Nums(2,8,10);
        System.out.println("sum1 = " + sum1);
        int sum2=sumOf4Nums(6,3,7,2);
        System.out.println("sum2 = " + sum2);
    }
    public static int sumOf2Numbers(int num1,int num2){

       return num1+num2;
    }
    public static int sumOf3Nums(int n1,int n2,int n3){

        return n1+n2+n3;
    }
    public static int sumOf4Nums(int n1,int n2,int n3,int n4){

        return n1+n2+n3+n4;
    }
}
