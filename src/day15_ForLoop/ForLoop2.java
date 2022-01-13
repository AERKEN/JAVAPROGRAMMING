package day15_ForLoop;

public class ForLoop2 {
    public static void main(String[] args) {
        // A=Z , a-z, Z-A, z-a

        for (int i=65; i<=90; i++){           //use int
            System.out.print((char) i+" ");
        }

        System.out.println("\n__________________________________________-");
        // use char to get character

        for (char i='A'; i<='Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println("\n______________________________________________");
        //a-z

        for ( char i='a'; i<='z'; i++ ){
            System.out.print(i+" ");
        }
        System.out.println("\n_______________________________________________");
        //Z-A
        for (char i='Z'; i>='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println("\n_______________________________________________");

        for (char i=1; i<=40000; i++){
            System.out.print(i+" ");
        }


    }

}
