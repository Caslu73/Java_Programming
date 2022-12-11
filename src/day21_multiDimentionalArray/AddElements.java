package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {
        //create  a function to add the element into integer

        int [] array = {1,2,3,4,5};
        int element = 6;


        int [] new_array = Arrays.copyOf(array, array.length + 1);// new array created here, copied from old array plus one more space for a element
            new_array[new_array.length-1]= element; //Adding the element into the new array
        System.out.println(Arrays.toString(new_array));


        System.out.println("-------------------------------------------");
            int [] numbers = {100,90,80,70,60};

      numbers =  ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------------");
            double [] nums = {1.5, 2.5, 3.5, 4.5};

            nums=ArraysUtility.addElement(nums, 5.5);
            nums=ArraysUtility.addElement(nums, 6.5);
            nums=ArraysUtility.addElement(nums, 7.5);

            System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------");

        String [] students = {"Lucas","Maggie", "Erick"};
        students = ArraysUtility.addElement(students, "Jose");
        System.out.println(Arrays.toString(students));

    }


}
