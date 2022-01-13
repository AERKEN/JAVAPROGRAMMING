package day08;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number=300;
         boolean evenNumber= number%2==0;
         boolean oddNumber= !evenNumber;

         if (evenNumber){
             System.out.println("evenNumber = " + evenNumber);

             if (oddNumber){
                 System.out.println("oddNumber = " + oddNumber);
             }
         }
        System.out.println("---------------------------------------------");

         int n=200;
         //positive
        if(n>0){
            System.out.println(n+" is positive");
        }
        //nagitive
        if(n<0){
            System.out.println(n+" is nagitive");
        }
        // zero
        if(n==0){
            System.out.println(n+" is equal 0 ");
        }

    }
}
