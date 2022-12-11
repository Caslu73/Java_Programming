package day05_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println( a ); // 20

        System.out.println( a ); // 20

        a = 40; // Here I am saying that a will have a new vale that is 40

        System.out.println(a);

        a = 90; // Here I am saying that a will have a new vale that is 90

        System.out.println(a);

        System.out.println("------------------------------------------------------------------");

        double balance = 100;

        balance += 1000; // balance = 100 + 1000. I am telling to add 1000 to the original balance which is 100.

        System.out.println("balance = " + balance);

        balance += 500;// balance = 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;

        System.out.println("balance = " + balance);

        System.out.println("-------------------------------------------");

        //Subtraction

        balance -= 1000; // balance 11600 - 1000

        System.out.println("balance = " + balance);

        balance -= 5000;

        System.out.println("balance = " + balance);

        System.out.println("--------------------------------------");

        // Multiplication OPERATOR.

        double salary = 45000;

        salary *= 2; // Salary will be double multiply by 2, so salary = 45000 * 2 = 90000

        System.out.println("salary = " + salary);

        salary *= 3;

        System.out.println("salary = " + salary);

        System.out.println("-----------------------------------");

        double eth = 4; // ETH price 4 years ago.

        eth *= 250; // ETH actual price increase to 250 times

        System.out.println("eth = " + eth);

        eth /= 2; // This is to know if the price crash to 50%. Using division by 2

        System.out.println("eth = " + eth);

        System.out.println("-------------------------------------------------------");

        System.out.println("salary = " + salary);

        salary /= 2; // Reducing the salary by HALF. Using division by 2

        System.out.println("salary = " + salary);

        System.out.println("-------------------------------------------------------");

        int b = 39; //Remaining Assignment

        b %= 7;

        System.out.println("b = " + b);



    }
}
