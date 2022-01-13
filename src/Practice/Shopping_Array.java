package Practice;

public class Shopping_Array {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexOf=0;
        String hasIpad="";

        for (int i = 0; i < items.length; i++) {
            if ("Gloves".equals(items[i])) {
                indexOf = i;
            }
            for (int j = 0; j < items.length; j++) {
                if ("iPad".contains(items[j])) {
                    hasIpad = "YES";
                }
            }
            System.out.println(items[i]+" - "+prices[i]+"$ - #"+itemIDs[i]);

        }
        System.out.println("Index of Gloves is:"+indexOf);
        System.out.println("hasIpad = " + hasIpad);
    }
}
