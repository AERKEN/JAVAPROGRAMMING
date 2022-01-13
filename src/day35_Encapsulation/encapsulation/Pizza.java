package day35_Encapsulation.encapsulation;

public class Pizza {

    private String size;
    private int numOfCheeseTopping, numOfPepperoniTopping;


    public Pizza(String size, int numOfCheeseTopping, int numOfPepperoniTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equals("small")||size.equals("medium")||size.equals("large"))){
            return;
        }

        this.size = size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        if (size.equals("small")&&numOfCheeseTopping<0||numOfCheeseTopping>3){
            return;
        }else if (size.equals("medium")&&numOfCheeseTopping<0||numOfCheeseTopping>4){
            return;
        }else if (size.equals("large")&&numOfCheeseTopping<0||numOfCheeseTopping>5){
            return;
        }

        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public int getNumOfPepperoniTopping() {
        return numOfPepperoniTopping;
    }

    public void setNumOfPepperoniTopping(int numOfPepperoniTopping) {
        if (size.equals("small")&&numOfPepperoniTopping<0||numOfPepperoniTopping>4){
            return;
        }else if (size.equals("medium")&&numOfPepperoniTopping<0||numOfPepperoniTopping>5){
            return;
        }else if (size.equals("large")&&numOfPepperoniTopping<0||numOfPepperoniTopping>5){
            return;
        }
        this.numOfPepperoniTopping = numOfPepperoniTopping;
    }


    public double calCost(){
       double total=0.0;

       total=(size.equals("small"))?10:(size.equals("medium"))?12:14;
       total+=2*(numOfCheeseTopping+numOfCheeseTopping);
       return total;
    }

    public String toString()  {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfCheeseTopping=" + numOfCheeseTopping +
                ", numOfPepperoniTopping=" + numOfPepperoniTopping +
                ", TotalCost=" + calCost() +
                '}';
    }
}
