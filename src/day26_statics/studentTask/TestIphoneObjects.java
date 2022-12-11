package day26_statics.studentTask;

public class TestIphoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone12", "Black", 1000);

        System.out.println(iphone1.color);
        System.out.println(iphone1.model);
        System.out.println(iphone1.price);
        System.out.println("----------------");

        iphone1.printPhoneInfo();//print model, color, price, brand


       /* System.out.println(iphone1.brand);
        System.out.println(iphone1.OS);
        iphone1.printOperatingSystem();

        */

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();



    }

}
