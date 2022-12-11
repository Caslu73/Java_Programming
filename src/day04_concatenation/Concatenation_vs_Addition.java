package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        // This is CONCATENATION.

        System.out.println("32" + 1); // 321 will be the result. 32 is the String

        System.out.println(7 + "1"); // 71 will be the result. 1 is the String

        System.out.println("13" + "2"); // 132 will be the result. 13 and 2 are Strings.

        System.out.println("---------------------------------------------------------------");

        System.out.println(12 + 2.5); //14.5 THIS IS ADDITION

        System.out.println("---------------------------------------------------------------");

        System.out.println("The value is " + true); // Concatenation with boolean "true"


    }
}
