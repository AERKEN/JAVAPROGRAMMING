package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str="JavaJavaJavaPython";
        int fre=0;

        while (str.contains("Java")){
            str=str.replaceFirst("Java","");
            fre++;
        }
        System.out.println(fre);
        System.out.println("_____________________________");
        String s="cat cat cat cat dog";
        int f=0;
        while (s.contains("cat")){
            s=s.replaceFirst("cat","");
            f++;
        }
        System.out.println(f);
        System.out.println("_________________________________________");

        String sen="java java java c c c ";
        int countJava=0;
        int countC=0;

        while (sen.contains("java")||sen.contains("c")){
            sen=sen.replaceFirst("java","");


            }
        }
    }

