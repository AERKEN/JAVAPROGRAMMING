package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="AAABBBCAAAAAAAAAAAAA";
        char ch='A';
        int frequency=0;

        for (int i = 0; i <str.length(); i++) {       // i:index of str

            char eachChar=str.charAt(i);    //eachChar : each character of str

            if (ch==eachChar){         //if given ch is matching with the eachChar,then ch is appeared in the string
                frequency++;
            }
        }System.out.println(frequency);
        System.out.println("_____________________________________________________");
        //frequency of word
        String sentence="JavaJavaJava";
        int fre=0;

        for (int i = 0; i < sentence.length()-3; i++) {
           String eachsub= sentence.substring(i,i+4);

           if (eachsub.equals("Java")){
               fre++;

           }
        }
        System.out.println(fre);
        System.out.println("__________________________________________________");
        //frequency of word
        String s="cat cat DOG cAT CAt";
        int f=0;

        for (int i = 0; i < s.length()-2; i++) {
           String eachS= s.substring(i,i+3);

           if (eachS.equalsIgnoreCase("cat")){
               f++;
           }

        }
        System.out.println(f);
    }
}
