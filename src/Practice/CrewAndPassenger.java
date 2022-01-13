package Practice;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int num=50;
        String people="";

        if (num>0 && num<100){

            if (num==50){
                people="20 crew,30 passenger";
            }else if (num==75){
                people="25 crew,50 passenger";
            }else{
                people="50 crew,50 passenger ";
            }
        }else{
            System.out.println("invalid");
        }
        System.out.println(people);



        String people2=(num>0 && num<100)?(num==50)?"20 crew,30 passenger":(num==75)?"25 crew,50 passenger"
                :"50 crew,50 passenger":"invalid";
        System.out.println(people2);






    }

}
