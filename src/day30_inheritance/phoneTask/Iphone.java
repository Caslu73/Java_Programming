package day30_inheritance.phoneTask;

public class Iphone extends phone {//relationship created, Iphone is a phone


    //Constructor

    public Iphone( String model, String size, double price, String color){
        super("Apple", model, size, price, color);
    }



    public void faceTime(long phoneNumber){
        System.out.println(getModel() +" is face timing with " +phoneNumber);
    }


    public void faceTime(String email){

        System.out.println(getModel() + "is face timing with "+ email);

    }

    public static boolean hasApplePay = true;

}
