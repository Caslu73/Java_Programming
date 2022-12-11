package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

    eligible(18);
        System.out.println("---------------------------------------------" );

        System.out.println("Test Started");
        boolean exit = false; // If is true it will be terminated, and it will not execute the remaining code
        if(exit){
            return; // main method gets terminated, specially for void method to terminated
        }

        int result=multiplication(3,89);
        System.out.println("result = " + result);
    }

    public static void eligible(int age){

        if(age<0 || age > 150){
            System.err.println("Invalid age: "+age);
            return; // exits the method when is using in void method
            // if the age is invalid then this method gets terminated
        }

        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.err.println("You are not eligible to buy alcohol");
        }

    }

    public static int multiplication(int n1, int n2){

        int result = n1 * n2;

        return result; // returns the value when exiting the method
    }


}
