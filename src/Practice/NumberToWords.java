package Practice;

public class NumberToWords {
    public static void main(String[] args) {

        int num = 8;

        String result = (num >= 0 && num <= 9) ?
                (num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"three"
                        :(num==4)?"four":(num==5)?"five":(num==6)?"six"
                        :(num==7)?"seven":(num==8)?"eight":"nine":"invalid number";

        System.out.println(result);


    }






    }

