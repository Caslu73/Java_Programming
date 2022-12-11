package day19_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int arr1 [] = {10, 20, 30, 40, 50};// OBJECTS
        int arr2 [] = arr1;
        int arr3 [] = arr2; // THEY ALL SHARING THE SAME OBJECT

        arr1[0] = 1000; // change the value of the objects
        arr2[2] = 3000; // also here

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------------------------------");

        String a1 []= {"Lucas", "Jose"}; // This objects eligible to garbage collection

        a1 = new String[] {"James", "Daniel"};


        System.out.println(Arrays.toString(a1));



    }
}
