package Practice;

public class FirstDuplicated {
    public static void main(String[] args) {
        String s="dahhllkk";
        String result="";



        for (int i = 0; i <s.length() ; i++) {
            char each=s.charAt(i);
           int ch=0; int count=0;
            if (ch==each){
                count++;
            }System.out.println(""+count);

        }

    }
}
