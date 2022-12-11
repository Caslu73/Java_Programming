package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");

        int total = input.nextInt();

        int [] numbers = new int[total];// ex if the input in total is 10 than the objects it will be 10
        int sum = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
            sum += numbers[i]; // sum of the all numbers from the array

        }

        double average = sum / (double) total;// explicit casting to get decimal

        DecimalFormat df = new DecimalFormat("0.00"); // <==to get this kind of pattern in the double result.

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));


    }
}
/*
1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */
