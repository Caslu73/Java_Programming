package day27_accesModifier;

public class Car { // outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{//Inner class

        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }

    //ONLY THE INNER CLASS CAN BE STATIC

    public static class StaticInnerClass{//STATIC ONLY ACCEPT STATIC
        public void method(){
           // System.out.println(make);
            System.out.println(wheels);

        }
    }
}
