package day19_array;

import java.util.Arrays;

public class ArraysLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // the size of the two array are the same size
        int [] nums = {10,20,30,40,50}; // Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("-----------------------------------------");
        //element:         1          2           3           4            5        6              7
        String days []= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            //index number  0    ,    1     ,     2      ,     3      ,    4   ,    5      ,     6
        int n = 1;  // element

        System.out.println(days[n-1]); // monday

        System.out.println("-----------------------------------------");

        String month []= {"Jan", "Feb", "March", "Apr", "May", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("month = " + Arrays.toString(month));

        System.out.println("-----------------------------------------");

       //int numbers2 [] = new int[100];

        for (int i = month.length - 1; i >= 0; i--) { // PRINT REVERSE THE MONTHS
            System.out.println(month[i]);

        }




    }

}
