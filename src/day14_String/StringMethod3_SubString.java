package day14_String;

public class StringMethod3_SubString {
    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word="Java Programming Language";

        String s1=word.substring(0,word.lastIndexOf(" ")); //Java
        String s2=word.substring(word.indexOf(" ")+1, word.lastIndexOf(" "));  //Programming
        String s3=word.substring(word.lastIndexOf("L"));   //Language

        System.out.println( s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("_______________________________________________");


        String email="Cydeo.School@gmail.com";

        String domain=email.substring(email.indexOf("g"),email.lastIndexOf("."));
        System.out.println(domain);

        String n1="Java is fun, Java is cool";
        n1=n1.substring(0,10+1);   //first part
        int n2=n1.lastIndexOf(" J");  //last j
        System.out.println(n1);
        System.out.println(n2);

    }
}
