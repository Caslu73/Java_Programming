package day26_statics.studentTask;

public class ConstructorCalls {
    //CONSTRUCTORS
    public ConstructorCalls(){

        System.out.println("Default constructor");
    }
    public ConstructorCalls(int a){
        this();//this keyboard can only be use inside of other Constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");

    }

    public ConstructorCalls(String c){
        this(2.3);
        System.out.println("Constructor with String argument");
    }


//METHODS
    public static void main(String[] args) {
        method1();
        System.out.println("---------------------------------------------------");
        method2();
    }

    public static void  method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

}
