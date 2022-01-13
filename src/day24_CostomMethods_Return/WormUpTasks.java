package day24_CostomMethods_Return;

public class WormUpTasks {
    public static void main(String[] args) {
        initials("gulfi","erkin");
        domain("farya@gmail.com");
        nameOfMonth(8);
        nameOfdays(5);
        uniqueCharactor("aaabccc");

    }
    //1. Create a method that can display the initials of the person. initials(info);
    public static void initials(String firstName,String lastName){
        String initials=firstName.charAt(0)+"."+lastName.charAt(0);
        initials=initials.toUpperCase();
        System.out.println(initials);
    }
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,+email.lastIndexOf("."));
        System.out.println(domain);
    }
    public static void nameOfMonth(int number){
        String name="";
        if (number>0&&number<=12){
            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }
    public static void nameOfdays(int number){
        String name="";
        if (number>0&&number<=7){
            name = (number==1)?"Mon" :(number==2)?"Tues" :(number==3)?"Wed" :(number==4)?"Thurs" :(number==5)?"Friday"
                    :(number==6)?"Saturday" :"Jul";
        }else {
            name="Invalid";
        }
        System.out.println(name);
    }

public static void uniqueCharactor(String word){

    for (int i = 0; i < word.length(); i++) {

        if (word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
            System.out.println(word.charAt(i));
        }

    }
}






    }













/*
        1. Create a method that can display the initials of the person

        2. Create a method that can display the domain of the email

        3. Create a method that can display the name of the month based on the given number to the method

        4. Create a method that can print the name of the day based on the given number to the method

        5. Create a method that can print how many days a month has
*/