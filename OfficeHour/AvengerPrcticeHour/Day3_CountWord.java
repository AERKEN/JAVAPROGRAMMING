package AvengerPrcticeHour;

public class Day3_CountWord {
    public static void main(String[] args) {

        String sentence1="Java is Java";
        String word1="Java";
        int count1=0;

        for (int i=0; i<=sentence1.length()-1-word1.length();i++){

            String temp= word1.substring(i,word1.indexOf(i));

            count1++;
        }













        String sentence2="Java is Java";
        String word2="Java";
        int count2=0;

        while (sentence2.contains(word2)) {
            count2++;

            sentence2=sentence2.replaceFirst(word2,"");
        }


        System.out.println("count2 = " + count2);

    }
}
 /*
    Count the word that is given inside the sentence
        input: Java is Java
        word:Java
        output:2

  */