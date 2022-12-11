package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 30;

        boolean isDivisibleBy2 = number % 2 == 0;
        //If the remainder of number divided by 2 is equal to 0, then it's evenly divisible by 2

        boolean isDivisibleBy3 = number % 3 == 0;
        //If the remainder of number divided by 3 is equal to 0, then it's evenly divisible by 3

        boolean isDivisibleBy5 = number % 5 == 0;
        //If the remainder of number divided by 5 is equal to 0, then it's evenly divisible by 5

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);


    }
}
