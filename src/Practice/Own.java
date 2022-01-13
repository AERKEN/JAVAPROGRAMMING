package Practice;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Scanner;

public class Own {
    public static void main(String[] args) {



       double[] doub=new double[4];
       doub[0]=1.0;
       doub[2]=42.1;
       doub=new double[4];
       doub[1]=17.2;
       doub[3]= doub.length;

        System.out.println(Arrays.toString(doub));
        System.out.println("_____________________________");

        String[] words={"one","two","three","four"};
        String[] other=new  String[words.length];

        for (int i = 0; i < words.length ; i++) {
            other[i]=words[i]+words[i].length();

        }
        System.out.println(Arrays.toString(other));

        System.out.println("__________________________________________________________-");

        int[] nums=new int[5];
        int a =5;

        nums[2]=a;  //5
        nums[0]=a*2;  //10
        nums[4]=nums[1]*a;  //0
        nums[1]=nums[2];    //5
        nums[3]=nums[a-3];  //5 (5-0)

        System.out.println(Arrays.toString(nums));


        int number=5;

        while (number<100){
            number+=number;
        }
        System.out.println(number);


        int a1 =0;

        do {
            a1=a1++ + --a1 -(a1%3);
        }while (++a1<4);
        System.out.println(a1);

    String str="The whole time it was raining.";

    do {
        System.out.println(str.charAt(0));
        str=str.substring(3);
    }while (!str.isEmpty());
        System.out.println("_______________________________________");


     String input="today it will be 100 degrees!";
     int n=0;


     while (n++<input.length()){

         if (n==8){
             continue;
         }else  if (n==9){
             break;
         }

         System.out.println(input.charAt(++n));
     }

        System.out.println("___________________________________________");


       int count=0;

       for(int a2=0; a2<4; a2++){

           if (a2==3)continue;

           for (int b= a2+1; b<5; b++){
               count++;

               if (b==3)break;
           }

       }
        System.out.println(count);
        System.out.println("__________________________________________");

        int[] num=new int[5];
        int x=5;

        num[2]=x--;  //5
        num[0]=x*2;  //8
        num[4]=--x+(x-9);  //-3
        num[1]=num[2];     //5
        num[3]=num[x-3];   //0s

        System.out.println(Arrays.toString(num));

        System.out.println("________________________________");

        String[] strs={"display","population","meeting","copy","franchise"};

        int y=strs.length;
        int z=strs[4].length();

        System.out.println(y+" "+z);

        System.out.println("______________________________________________");

        int[] arr={1,3,12,5,24,7,9,10};
        boolean[] bArr=new boolean[arr.length];

        for (int i=arr.length-1; i>-1;i--){
            if (arr[i]%2==0){
                bArr[arr.length-1-i]=true;
            }
        }
        System.out.println(Arrays.toString(bArr));

        System.out.println("___________________________________________");

        int[] numbers={14,1,84,97,1243,46};
        int total=0;


        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i]%2!=0){
                total+=3;
            }else {
                total+=10;
            }

            if (i%3==0){
                total-=15;
            }

        }

        System.out.println(total);

        System.out.println("____________________________________________");

        String[] things={"house","shed","slide","zebra","park","garden"};

        for (String s:things){

            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1); break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);break;
                case 'o':
                default:
                    System.out.println(4);
                    case 'p':
                        System.out.println(5);break;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);
            }
        }

        System.out.println("__________________________________________________");









    }}












