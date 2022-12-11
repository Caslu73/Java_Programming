package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //-----Implicit Casting-------

        byte a = 15;

        short b = a;
        //short b = (short)a;

        System.out.println(b);

        int c = a; // implicit casting

        System.out.println(a);

        long d = 3000l;

        float f = d; //implicit casting

        System.out.println(f);

        //--------- Explicit Casting----------

        int x = 100;

        byte y = (byte) x;

        float z = 20.8f;

        short q = (short) z; // z = 20.8 still will be but when it prints q it will print integer number ONLY 20

        System.out.println(y);
        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; // n1 = 2.5 still will be but when it prints n2 it will print integer number ONLY 2

        System.out.println(n2);

        System.out.println("-------------------------------------------------");

        int num = 500;

        byte result = (byte) num;

        System.out.println(result);

        int r = 50000;

        short t = (short)r;

        System.out.println(t);

        System.out.println("-------------------------------------------------");

        double u = 3000.5;

        int p = (int) u; // explicit casting

        System.out.println(p);

        int o = 100;

        double d1 = o; // Implicit casting

        System.out.println(d1);





    }
}
/*

 */