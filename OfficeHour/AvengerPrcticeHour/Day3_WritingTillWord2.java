package AvengerPrcticeHour;

public class Day3_WritingTillWord2 {
    public static void main(String[] args) {


        String word="Code";
        String c=word.charAt(0)+"";  //c
        String co=""+word.charAt(0)+word.charAt(1); //co
        String cod=""+word.charAt(0)+word.charAt(1)+word.charAt(2); //cod
        String code=""+word.charAt(0)+word.charAt(1)+word.charAt(2)+word.charAt(3);  //code


        String temp="";

        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j <=i; j++) {
                temp+=""+word.charAt(j);


            }
            temp+="-";
        }

    temp=temp.substring(0,temp.length()-1);
        System.out.println("temp = " + temp);


    }


}
