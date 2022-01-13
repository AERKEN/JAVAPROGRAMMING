package costomMethodTasks;

public class OddAndEven {
    public static void main(String[] args) {
        oddNum();
        System.out.println();
        evenNum();
    }

    public static void oddNum(){

        for (int i = 1; i < 101; i++) {
            if (i%2!=0)
            System.out.print(i+" ");
        }
    }
    public static void evenNum(){
        for (int j = 2; j < 101; j+=2) {
            System.out.print(j+" ");

        }
    }
}
