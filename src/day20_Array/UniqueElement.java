package day20_Array;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words={"java","java","C#","python","python"};


        int count=0;

        for (int j = 0; j < words.length; j++) {
            String element=words[j];


            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)){
                    count++;
                }

            }
            if (count==1){
                System.out.println(element);
            }

        }







    }
}
