package day21_multiDimentionalArray;

public class MultiDimensionalArrayPractices3 {

    public static void main(String[] args) {
            //??                0      1          0           1
        int [][][] arr3D1 = {{{1,2},{3,4,5}}, {{6,7,8,9},{12,13,14}}};
                  //??            0                       1
        int [][][] arr3D2 = {{{1,2},{3,4,5}}, {{6,7,8,9},{12,13,14}}};
        int [][][] arr3D3 = {{{1,2},{3,4,5}}, {{6,7,8,9},{12,13,14}}};

        int[][][][] arr4D = { arr3D1, arr3D2, arr3D3};

        for(int [][][] each3D : arr4D){
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);

                    }

                }

            }
        }

        



    }
}