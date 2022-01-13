package day35_Encapsulation.encapsulation;

public class Item {


    private String name;
    private double unitPrice;
    private double quantity;

    public Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()){
            return;
        }
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)>=33&&name.charAt(i)<=64){
                return;
            }
        } if(!((name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') ||
                (name.charAt(0) >= 'a' && name.charAt(0) <= 'z'))){
            return;
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity<0){
            return;
        }if(name.equalsIgnoreCase("toilet paper")){
            quantity =1;
        }
        this.quantity = quantity;
    }

    public double Cost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + Cost() +
                '}';
    }
}
