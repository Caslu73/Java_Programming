package day26_statics.studentTask;

public class Iphone {//OBJECT

    //static method,
    public static String brand = "Apple";//Apple is the brand of all the iphone object's

    public String model; //instance: different models for iphone objects

    public String color;//instance

    public double price;//instance

    public static String OS = "iOS";//static: operating system is same for all objects

    public static String madeIn= "China";//static

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    //Constructor

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    /*  public static void printPhoneInfo(){ //statics ONLY accepts statics
        System.out.println("brand = " + brand);
    }

   */

    public void printPhoneInfo(){ //Instance method, can share instance and static variables
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("brand = " + brand);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: "+OS);
    }




}

/*
Attributes
brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen
 */
