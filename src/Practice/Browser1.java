package Practice;

public class Browser1 {
    public static void main(String[] args) {

        String browserName="firefox", result="";

        switch (browserName){
            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                result= "valid Browser";
                break;
            default:
                result= "Invalid Browser";
        }
        System.out.println(result);

    }
}
