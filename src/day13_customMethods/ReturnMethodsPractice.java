package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        System.out.println(isOdd(7));   // Here I am calling the methods created below
        System.out.println(isEven(87));
        System.out.println(max(7, 7));
        System.out.println(min(154,1111));
        int num = 8;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num +" is odd number");
        }


    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } //DON'T EVEN NEED TO WRITE }ELSE{ Because if the first it's not executed, then it will execute directly false
            return false;



    }


    public static boolean isEven(int num){
       if(num % 2 == 0){
           return true;
       }else{
           return false;
       }
    }

    public static int max(int n1, int n2){
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }

    public static int min(int n1, int n2){
        if(n1<n2){
            return n1;
        }else{
            return n2;
        }
    }
}


/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
