package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) { //each:"Elminur Ablimit", "Ali Kilic", "Hulya Keles"...
            String rev="";

            for (int i = each.length()-1; i >=0 ; i--) {
                rev+=each.charAt(i);    //index of each

            }
            System.out.println(rev);
        }



    }
}
