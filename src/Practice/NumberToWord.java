package Practice;

public class NumberToWord {
    public static void main(String[] args) {
        int num=6; String word;
        if (num==1){
            word="one";
        }else if(num==2){
            word="two";
        }else if (num==3){
            word="three";
        }else if (num==4){
            word="four";
        }else if (num==5){
            word="five";
        }else if (num==6){
            word="six";
        }else{
            word="seven";

        }
        System.out.println(word);
    }
}
