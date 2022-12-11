package day26_statics.studentTask;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){
        this();//calling the default constructor
        System.out.println("int argument");
    }

    public ConstructorCalls2(String a){
        this(10);
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();//Default

        System.out.println("------------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);//Default, int argument

        System.out.println("-------------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");


    }


}
