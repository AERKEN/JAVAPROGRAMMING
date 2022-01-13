package Practice;

public class GradeLevel1 {
    public static void main(String[] args) {
        byte age = 20;
        String result = "";


        if (age >= 1 && age <= 18) {

            switch (age) {
                case 6:
                case 7:
                case 8:
                    result = "Middle";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "high school";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    result = "college";
                    break;
                case 17:
                case 18:
                    result = "grade school";
                    break;

                default:
                    result = "elementary";
            }
        } else {
            result = "invalid Grade";

        }
        System.out.println(result);
    }
}