package day05_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        System.out.println( a > b);

        boolean aIsGreater = a > b ;

        System.out.println(aIsGreater);

        System.out.println("----------------------------------------------");

        int score = 75;

        boolean passed = score >= 60; // Greater than or equal, score 75 is greater than or equal to 60. TRUE

        System.out.println(passed);

        System.out.println("-------------------------------------------------------");

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("-------------------------------------------------------");

        System.out.println( 100 > 100 ); // FALSE
        System.out.println( 100 >= 100); //True
        System.out.println( 100 >= 185);  //False
        System.out.println( 100 >= 85); // TRUE

        System.out.println("-------------------------------------------------------");

        score = 48;

        boolean failed = score < 60;

        System.out.println(failed);

        System.out.println("-------------------------------------------------------");

        System.out.println(100 < 2000); //true
        System.out.println(100 < 20); // false

        System.out.println("-------------------------------------------------------");


        System.out.println( 95 <= 100); // True

        System.out.println(100 <= 100); // true

        System.out.println(10 <= 5);// false

        System.out.println("-------------------------------------------------------");

        // System.out.println(java <= C#); // Relational Operators <=, => , < , >   are only for numbers

        System.out.println( 'a' > 'b');
        //                  65  >   66
        // 'a' and 'b' are ASCII tables



    }
}
