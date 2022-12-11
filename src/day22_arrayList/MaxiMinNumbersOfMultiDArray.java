package day22_arrayList;

public class MaxiMinNumbersOfMultiDArray {

    public static void main(String[] args) {
        //found the number of multidimensional array
        // index of elements:0 , 1 , 2    0  , 1 , 2     0 , 1 , 2
        int [][] array ={ {100,20000,300}, {10,1000,50},{-200,400,0} };//indexes of array : 0 ~ 2
        //index of 1D array:   0              1             2

        int max = array [0][0];
        int min = array [0][0];

        for (int[] each1D : array) {

            for (int eachElement : each1D) {
             if(eachElement > max){
                 max = eachElement;
             }

             if(eachElement < min){
                 min = eachElement;
             }


            }

        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
    }
}
