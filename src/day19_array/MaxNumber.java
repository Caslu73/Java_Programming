package day19_array;

public class MaxNumber {

    public static void main(String[] args) {

    int numbers [] = {100 , 20 , 500, 40, -10, 30};

    int max = numbers[0];//assume that first element is the maximum number


                    //1 ,  means "20" from the "numbers"
        for (int i = 1; i < numbers.length; i++) { //i ; 1, 2, 3, 4, 5
            if(numbers[i] > max){// compare the element of the array with the current maximum number
                max = numbers[i];//when is true the numbers[i]will be assigment to the variable max. It replaces the current max number.
            }
        }
        System.out.println("max = " + max);

    }

/*
Write a program that can find the maximum number from an array
 */

}
