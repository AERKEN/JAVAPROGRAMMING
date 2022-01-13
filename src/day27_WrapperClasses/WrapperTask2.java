package day27_WrapperClasses;

public class WrapperTask2 {
    public static void main(String[] args) {

         String letters="";
         String Digits="";
         String specialChar="";



        String str="8Wooden@ Spoon!";

        for (char each:str.toCharArray()){
            if (!Character.isLetterOrDigit(each)){      specialChar+=""+each;
            }else if (Character.isDigit(each)) {         Digits += "" + each;
            }else if (Character.isLetter(each)){         letters+=""+each;}

        }
        System.out.println("letters ="+"\""  + letters+"\"");
        System.out.println("Digits = " + Digits);
        System.out.println("specialChar = " + specialChar);
        System.out.println("__________________________________________________");

        String s="JAVA java";
        int countUp=0;
        int countLow=0;

        for (char each:s.toCharArray()){
            if (Character.isLowerCase(each)){
                countLow++;
            } if (Character.isUpperCase(each)) {
                countUp++;
            }
        }
        System.out.println(countLow==countUp);








    }
}
