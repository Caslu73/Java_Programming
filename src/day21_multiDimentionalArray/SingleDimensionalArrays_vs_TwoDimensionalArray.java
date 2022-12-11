package day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArrays_vs_TwoDimensionalArray {

    public static void main(String[] args) {
//SINGLE DIMENSIONAL ARRAY THAT CONTAIN ELEMENTS
        int[] arr1D = new int [10]; // IT CAN CONTAIN 10 ELEMENTS

        System.out.println(Arrays.toString(arr1D)); //In order to print this single dimensional array to use toString()

        int [] arr1 = { 1,2,3,4,5};
        int [] arr2 = {6,7,8};
        int [] arr3 = {9,10};
        int [] arr4 = {11,12,13,14,15};
        int [] arr5 = {16,17,18,19,20,21};

        int [] arr6 = {30,40,50,60,70,80,90};



        //FIXED MEANS IF YOU KNOW HOW MANY DIMENSIONAL ARRAY WILL BE STORE IN TWO DIMENSIONAL ARRAY
// the size of this twoDimensional(arr2D)array is 5, means that it can contain 5 SINGLE DIMENSIONAL ARRAY
        int [][] arr2D = new int [5][];//index : 0~4
        //TWO DIMENSIONAL ARRAY are for contain one dimensional array, NOT FOR CONTAIN ELEMENTS.
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;




        //MAKE SURE to print with deepToString method in order to print TwoDimensional Array
        System.out.println(Arrays.deepToString(arr2D));




    }
}
