package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -20;

        boolean isPositive = number > 0; // If the number is greater than 0, then it's a positive number
        boolean isNegative = number < 0; // If the number is less than 0, then it's a positive number
        //boolean isZero = number == 0; // If the number is equal to 0, then it's 0

        boolean isZero = !isPositive && !isNegative; // If the number is NOT positive and NOT negative, then it's zero

        System.out.println(number + " is positive number: " + isPositive );
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

    }
}
