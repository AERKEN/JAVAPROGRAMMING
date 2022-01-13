package day_09IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
                      //a=15 b=10 c=20 / a=15 b=20 c=10
        boolean aIsMedian= (a>b&& a<b) || (a>c&& a<b);
                      // a=10 b=15 c=20 / a=20 b=15 c=10
        boolean bIsMedian= (b<a&& b>c) || (b>a && b<c);
        //if a is the minimum number&
                      //
        boolean cIsMedian= !aIsMedian&&!bIsMedian;

        if (aIsMedian) { //
            System.out.println(a + " is the median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is the median number");
        }
        if (cIsMedian){
            System.out.println(c+" is the median number ");
        }
    }
}
