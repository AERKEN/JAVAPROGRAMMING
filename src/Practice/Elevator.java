package Practice;

public class Elevator {
    public static void main(String[] args) {
        int floorNum=3; String result="";

        if (floorNum==1||floorNum==2||floorNum==3){
            switch (floorNum){
                case 1:
                    result="Floor 1 selected, Companies: Lobby,Verizon, Starbucks";
                    break;
                case 2:
                    result="Floor 2 selected, Companies: Cybertek, NASA, Intelsat";
                    break;
                case 3:
                    result="Floor 3 selected, Companies: Lyft,BofA,Stake house";
                    break;
            }
        }else {
            result="invalid floor";

        }
        System.out.println(result);

    }
}
