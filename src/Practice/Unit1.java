package Practice;

import javax.swing.*;

public class Unit1 {
    public static void main(String[] args) {
        int a=5;
        double b=a;
        System.out.println(b);

        int num=-5;
        System.out.println(num++ +",");
        System.out.println(num=0);
        System.out.println(","+ --num);

        short s=13-9/3*10;
        s+=-10;
        System.out.println(s);

        boolean one=('a'!='z'&&false);
        boolean two=one||0==(9-10+1);
        System.out.println(two);

        long l=100;
        short S=(short) l;
        System.out.println(S+10);

        short s1=13+3*(10-6)%2;
        boolean b1=s1!=25;
        System.out.println(b1);

        byte b2=104;
        boolean check=b2<100;
        if (check){
            b2-=100;
        }else {
            b2=50;
        }
        System.out.println(b2);

        if (183==13+50*2+70){
            System.out.println("Java");
        }else {
        }   System.out.println("Soft skills");

            double pi=3.14;
            boolean c=119%5==0;
            int num1=0;

            if (pi>3.14&&!c){
                num1+=50;
            }else{
                num1-=50;
            }
            if (c){
                num1+=50;
            }
            System.out.println(num1);

            double decimal=13.142;
            int whole= decimal<20?20:10;
            System.out.println(whole);

          String name="Jimmy";
          boolean check1;
          if (name=="James"){
              check1=false;
          }else {
              check1=true;
          }
          String str=check1?"5":"10";

          int ch=132;
          String st="";
          if (ch%2==0) {
              st += ch;
              if (ch % 5 == 0) {
                  st += "132";
              } else {
                  st = "500";
              }
          }else {
                 st+="123";
              }
        System.out.println(st);

          }


    }


