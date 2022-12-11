package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone 12", "Large", 1000.5,"Black");

        Samsung samsung1= new Samsung("Galaxy s22", "Medium", 1000.8,"White");

        Nokia nokia1 = new Nokia("Brick","small",50,"Pink");


        iphone1.call(911);
        samsung1.text(911);
        nokia1.call(911);

        iphone1.text(123456789);
        samsung1.text(1234567789);
        nokia1.text(1234567889);

        System.out.println("===========================");

        iphone1.faceTime(12345678);

        samsung1.freeze();

        nokia1.selfDefense();

        System.out.println("=============================================");

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);
    }
}
