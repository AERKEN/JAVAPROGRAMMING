package day14_String;

public class StringMrthod2 {
    public static void main(String[] args) {

        String str= "Java is fun, I love learning Java"; // replace method
       str= str.replace("Java","python");

        System.out.println("str = " + str);

        String email="Gvlfi@gmail.com";
         email=email.replace("gmail","yahoo");
        System.out.println("email = " + email);

        String sen="Java java python python c# c# c++ c++ python python python";
        String sen1=sen.replace("python","" );
        sen1=sen1.replace("   "," ");
        System.out.println("sen1 = " + sen1);

        String s="Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog","cat");
        System.out.println("s = " + s);

        String s2="C# is fun, C# is cool";
        s2=s2.replace(" C#","Java");
        System.out.println("s2 = " + s2);

        String s3="Java";
        s3=s3.replace("a","e");
        System.out.println("s3 = " + s3);

        String result="Java Java Java";
        result=result.replaceFirst("Java","python");
        System.out.println("result = " + result);

        String result2="C# IS fun, C# is cool";
        result2=result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);

        String result3="Java";
        result3=result3.replaceFirst("va","vo");
        System.out.println("result3 = " + result3);


    }
}
