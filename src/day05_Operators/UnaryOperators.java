package day05_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        //pre increment/decrement. It changes the value immediately adding the OPERATORS before Operand.

        int x = 10;

        System.out.println( ++x ); //11 the value it will be 11. It prints directly the new value
        System.out.println(x); //11

        int y = 100;

        System.out.println( --y ); //99 will print directly
        System.out.println(y);

        System.out.println("--------------------------------------------");

        //post increment/decrement. It does not change the value immediately adding the OPERATOR After Operand.

        int a = 50;

        System.out.println( a++ );//50 It will not change here immediately
        System.out.println(a); // 51 In this print it will change the value to 51

        int b = 25;

        System.out.println( b-- ); //25 It will not change here immediately
        System.out.println(b); //24 Here it will change the value
        System.out.println("------------------------------------------");

        int n = 30;

        int m = n++; // m = 30, n=31 // "m" will be 30 because is post increment, it will keep the old value first always
                     // Next print it will change the value of "n" to 31

        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int z = 60; // Always will print first the old value, and the next will print the new value

        int q = z-- ; /* q= 60 z=59  Always post increment and decrement will show up the first old value
        and later the new one */

        System.out.println("q = " + q);
        System.out.println("z = " + z);


    }
}
