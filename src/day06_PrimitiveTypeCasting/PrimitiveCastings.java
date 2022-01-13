package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a=100;
        short b=a;
        int c=b;
        int x=55;
        short y=(short)c;
        System.out.println(x+":"+y);
        long j=1000000;
        short k= (short)j;
        System.out.println(j+":"+k);

        double n=10.8;
        int s=(int)n;
        System.out.println(n+":"+s);

        double d1=20.5;
        short s1= (short) d1;
    }
}
