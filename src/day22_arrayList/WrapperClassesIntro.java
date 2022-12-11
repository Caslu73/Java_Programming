package day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a = 10; // primitives

        Integer a2 = 10; // wrapperClass

        System.out.println("------------------------------------");
//to auto boxing it should be the same wrapper class than the primitive type
        int b1 = 100;
        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1;//Primitive convert to Integer WrapperClass object ==> Auto boxing

        char ch = 'A';
        Character ch2 = ch; // Autoboxing

        double d1 = 5.5;

        Double d2 = d1; //AutoBoxing

        //UNBOXING
        Integer n1 = 20;
        int n2 = n1; // unboxing
        //long n3 = n1;
        //double n4 = n1;

        Character e1 = 'Z';
        char e3 = e1; // unboxing



    }
}
