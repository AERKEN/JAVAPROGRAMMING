package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1= "     batch 25    ";  //trim method
         str1= str1.trim();
         System.out.println(str1);

                   // 01234567891011
         String str2="Cydeo School";
        int num= str2.indexOf("oo");
        System.out.println("num = " + num);

        String st1="Java programming";
        int num3=st1.indexOf("a");  //indexOf count the character from left //1
        System.out.println(num3);


        String st="Java programming"; //last m
        int num2=st.lastIndexOf("m");  //lastIndexOf - count the character from right //12
        System.out.println(num2);

        String s="Java Nova Cava Wawa orange";
        int firstA=s.indexOf("a");
        int lastA=s.lastIndexOf("a");
        int secondA=s.indexOf("a ");
        int thirdA=s.indexOf("a C");
        int forthA=s.lastIndexOf("av");  //11
        int fifthA=s.lastIndexOf("a W"); //13
        System.out.println("fifthA = " + fifthA);
        System.out.println("forthA = " + forthA);


        System.out.println(firstA);
        System.out.println(lastA);



    }
}
