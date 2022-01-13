package Practice;

public class Calculater {
    public static void main(String[] args) {

        int n1=5, n2=40;
        int result = 0;
        char mathOperator='*';

        if (mathOperator=='+') {
            result=n1+n2;
        }else if (mathOperator=='-'){
            result=n1-n2;
        }else if (mathOperator=='*'){
            result=n1*n2;
        }else if (mathOperator=='/'){
            result=n1/n2;
        }else{
            System.out.println("invalid operator");
        }
        System.out.println(result);
        }

    }
