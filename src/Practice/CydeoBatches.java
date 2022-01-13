package Practice;

public class CydeoBatches {
    public static void main(String[] args) {

        String type = "US evening", result="";
        boolean validBatch=(type=="US morning"|| type=="US evening"|| type== "EU");

        if (validBatch ){
            switch (type){
                case "US morning":
                    result="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    result="Class times are 10-5 EST. M, T, W, Th, F.";
                    break;
            }
        }else{
            result="invalid Batch";
        }
        System.out.println(result);
    }
}
