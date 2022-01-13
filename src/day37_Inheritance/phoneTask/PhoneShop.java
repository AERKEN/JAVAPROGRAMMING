package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {


        Iphone iphone= new Iphone("Iphone12","6.7 inches","Black",1000);

        Samsung samsung=new Samsung("galaxy S19","6 inches","Red",900);

        Nokia nokia=new Nokia("Brick","4 inches","Orange",500);


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


        iphone.call(911);
        iphone.text(1234567);
        iphone.faceTime(1234567);
        iphone.faceTime("farya@gmail.com");
        System.out.println(Iphone.hasBattery);


        System.out.println("++++++++++++++++++++++++++++++++++++");
        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();
        System.out.println(Samsung.hasBattery);

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();
        System.out.println(nokia.hasBattery);

    }

    }

