package ArrayTasks;

import java.util.Arrays;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25Group = new String[3][];
        batch25Group[0] = batch25Group1;
        batch25Group[1] = batch25Group2;
        batch25Group[2] = batch25Group3;
       // System.out.println(Arrays.deepToString(batch25Group));

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

       String[][] batch24groups=new String[3][];
       batch24groups[0]=batch24Group1;
       batch24groups[1]=batch24Group2;
       batch24groups[2]=batch24Group3;
       // System.out.println(Arrays.deepToString(batch24groups));

       String[][][] cydeoStudents=new String[2][0][0];
       cydeoStudents[0]=batch25Group;
       cydeoStudents[1]=batch24groups;


        for (String[][] students : cydeoStudents) {
            for (String[] groups : students) {
                for (String s : groups) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
    }
}
