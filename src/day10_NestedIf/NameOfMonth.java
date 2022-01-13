package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int num = 10; String month="";  // give a temporary data

        if (num >= 1 && num <= 12) {

            if (num==1){
                month="Jan";
            }else if (num==2){
                month="Fab";
            }else if (num==3){
                month="March";
            }else if (num==4){
                month="April";
            }else if (num==5){
                month="May";
            }else if (num==6){
            month="June";
            }else if (num==7){
                month="july";
            }else if (num==8){
                month="August";
            }else if (num==9){
                month="september";
            }else if (num==10){
                month="OC";
            }else if (num==11) {
                month = "Nov";
            }else {
                month="Dec";
            }



        } else {
            month="invalid";
        }
        System.out.println(month);
    }
}