package unit3;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(10);
        nums.add(0,6);
        nums.add(-7);
        nums.add(2,2);
        System.out.println(nums);


        System.out.println("_______________________________________");
        method1();
        System.out.println(method6("mark"));
        String str=method7("on the weekend",20);
        System.out.println(str);
        System.out.println("_______________________________________________");

        ArrayList<Integer> num=new ArrayList<>();

        num.add(4);
        num.remove(num.size()-1);
        num.add(2);
        num.add(10);
        num.add(0,6);
        num.remove(1);
        num.add(-7);
        num.add(2,2);
        System.out.println(num);
        System.out.println("________________________________________________");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s="";

        for (int i = 0; i < numbers.size(); i++) {

            if (i==2||i==5||i==9){
                continue;
            }
            if (numbers.get(i)==2||numbers.get(i)%3==0){
                s+="1";
            }else {
                s+="0";
            }

        }
        System.out.println(s);


    }
    public static void method1(){
        int n=-5;
        for (int i = 1; i <5 ; i++) {
            n*=i;

        }
        System.out.println(n);
    }


    public static int method4(char c ,String s){

        if (s.contains(""+c)){
            return 1;
        }else {
            return 0;
        }
    }

    public static int[] method6(String str){
        int[] arr=new int[str.length()];
        int n=10;

        for (int i = 0; i <arr.length ; i++) {
            if (n==20||n==50||n==70){
                continue;
            }
            arr[i]=n;
            n*=10;

        }
        return arr;
    }

    public static String method7(String str,int s){
        str=str.substring(6);

        if (s<10){
            str=str.substring(8);
        }else {
            if (str.length()>s){
                str="weekday";
            }else if (s>10||s==-10){
                str=str.substring(5);
            }
        }
        return str;
    }


}
