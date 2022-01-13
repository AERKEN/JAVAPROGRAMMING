package practice_05_01;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input= "  Hello world      I      love      Java    ";
        removeSpaces(input);
    }

    public static void removeSpaces(String str){
        String result = "";
        String[] strArr =str.trim().split(" ");
        //System.out.println(Arrays.toString(strArr));

        for(String each : strArr){
            if(!each.isEmpty()){
                result += each+ " ";
            }
        }
        System.out.println(result.trim());

    }
}
