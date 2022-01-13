package practice_05_01;

public class PrimeNumber {
    public static void main(String[] args) {

        for(int i=0;i<1000;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int number){

        if(number<2){
            return false;
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
}
