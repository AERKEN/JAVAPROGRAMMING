package Practice;

public class LoopTask1 {
    public static void main(String[] args) {
     //return the sum of even numbers between 1-100

        int sum=0;
      for (int i = 1; i <101; i++) {
            if (i%2==0){
                sum+=i;
            }
        } System.out.println(sum);

        System.out.println("____________________________");
        //return the sum of odd numbers between 1-100

        int sum1=0;
        for (int i = 1; i <101; i++) {
            if (i%2!=0){
                sum1+=i;
            }
        }     System.out.println(sum1);

        System.out.println("_____________________________");
        //calculate the sum of all numbers between 1 to any given number
        int sum2=0;
        for (int i = 1; i <51 ; i++) {
            sum2+=i;
        }
        System.out.println(sum2);
    }
}
