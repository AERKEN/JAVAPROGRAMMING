package AvengerPrcticeHour;

public class Day2_12_11_2021 {
    public static void main(String[] args) {
        String w1="hello";

        System.out.println(w1.substring(2)+w1.substring(0,2));



        String temp="";
        for (int i = 2; i <w1.length() ; i++) {

            temp+=w1.charAt(i);


        }

        for (int i = 0; i < 2; i++) {
            temp+=w1.charAt(i);

        }
        System.out.println(temp);





    }


}
