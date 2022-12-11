package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {
        //Dimensionals arrays 3
        int [][] arr2D1 = {{1,2}, {3,4,5}};
        int [][] arr2D2 = {{6,7,8,9}, {10,11}, {12,13,14}};
        int [][] arr2D3 = {{15,16,17,18}};
//if  I have to store 3 dimensional array, what should be my container?
        //index:                0       1            0         1          2            0
        int [][][] arr3D = { {{1,2}, {3,4,5}} , {{6,7,8,9}, {10,11}, {12,13,14}}, {{15,16,17,18}} };//index: 0~2
        //index:             0                    1                                 2
        //inside of int [][][]// [index of 2d array][index of 1d array][index of elements]

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1])); //[[6, 7, 8, 9], [10, 11], [12, 13, 14]]

// To get single D arrays from multidimensional array
        System.out.println(Arrays.toString(arr3D[0][1]));//[3, 4, 5]

        System.out.println(Arrays.toString(arr3D[1][0]));//[6, 7, 8, 9]
        System.out.println(Arrays.toString(arr3D[2][0]));//[15, 16, 17, 18]
        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(Arrays.toString(arr3D[0][1]));

        //TO PRINT THE ELEMENT

        System.out.println(arr3D[1][2][2]); //14
        System.out.println(arr3D[2][0][3]); // 18
        System.out.println(arr3D[2][0][2]); //17

        System.out.println("--------------------------------------------");

        //LOOP

        for (int i = 0; i < arr3D.length; i++) { //i : index of number of each 2 dimensional array
            int [][]each2DArray = arr3D[i]; //every index number of the multidimensional arr3D will be added to "each2DArray"
            System.out.println(Arrays.deepToString((each2DArray)));


            for (int j = 0; j < each2DArray.length; j++) { // j : index number of each 1 dimensional array
                int[] each1DArray = each2DArray[j];

                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // k : is each index number of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                }

            }

        }











    }


}

