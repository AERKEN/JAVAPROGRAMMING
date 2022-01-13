package AvengerPrcticeHour;

public class StringWithoutGivenIndex {
    public static void main(String[] args) {

        String w="kitchenner";
        int index=5;
        String temp=w.substring(0,index)+w.substring(index+1);

        String temp2="";
        for (int i = 0; i < index; i++) {

            temp2+=w.charAt(i);
        }
        for (int i = index+1; i <w.length() ; i++) {
            temp2+=w.charAt(i);
        }
        System.out.println(temp2);





    }
}
