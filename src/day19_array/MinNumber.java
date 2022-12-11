package day19_array;

public class MinNumber {

    public static void main(String[] args) {

        int numbers [] = {100 , 20 , 500, 40, -10, 30};

        int min = numbers[0];//assume that first element is the minimum number


        //1 ,  means "20" from the "numbers"
        for (int i = 1; i < numbers.length; i++) { //i ; 1, 2, 3, 4, 5
            if(numbers[i] < min){// compare the element of the array with the current minimum number
                min = numbers[i];//when is true the numbers[i]will be assigment to the variable max. It replaces the current min number.
            }
        }
        System.out.println("min = " + min);

    }


}
/*
 Write a program that can find the minimum number from an array
 */