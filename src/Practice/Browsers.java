package Practice;

public class Browsers {
    public static void main(String[] args) {

       String browsers="chrome", result="";
       boolean validBrowser= browsers=="chrome"||browsers=="firefox"||browsers=="opera"
                           ||browsers=="safari"||browsers=="edge";

       if (validBrowser){

           if (browsers=="chrome"){
               result=" chrome browser is selected";
           }else if (browsers=="firefox"){
               result=" firefox browser is selected";
           }else if (browsers=="opera"){
               result=" opera browser is selected";
           }else if (browsers=="safari"){
               result=" safari browser is selected";
           }else{
               result=" edge browser is selected";
           }
       }else{
           result="invalid Browser Name";
       }
        System.out.println(result);







    }
}
