package day15_whileLoop;

import java.util.Scanner;

public class maximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;// 10 become the maximum number
         //Any integer number that user enter will ALWAYS be greater than -2147483648


        for( int i = 0; i < 5; i++){ //i: 0,1,2,3,4 when it reaches 5 it will be false
            System.out.println("Enter a number:");
            int num = input.nextInt(); // 10, 5 ,3 , 20 , 15

            if(num > max){
                max = num; //IF the number inserted is greater than the actual number it will be converted to the new max number


            }

        }

        System.out.println("Maximum number is = " + max);

        input.close();


    }



}
/*
1. Write a program that can ask the user to enter
a number for 5 times and returns the maximum number
 */