package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers) { // I cannot change the quantity of the numbers

            if(each % 2 == 0){
                System.out.println(each);
            }
        }

        System.out.println("-------------------------------------------------------");
        //FOUND MAX NUMBER
        int [] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) { // each is the preferable name
            if(each > max){
                max = each; // each will be added to the max variable name
            }

            if(each < min){
                min = each;  // each will be added to the max variable name
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------");
                    //MERGE A1, A2
        int [] a1= { 10, 20, 30, 40, 50};
        int [] a2= {60, 70, 80, 90, 100, 110, 120};

        int[]a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1 ){
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++]=each;

        }
        System.out.println(Arrays.toString(a3));
        System.out.println("--------------------------------------------------");
        //Array Names of the students
        String[]names = {"Lucas caceres", "Antonio duarte", "Hernan mereles", "Angel carrera", "Ana niidea"};


        for (String each : names) {
            System.out.println(each.charAt(0) +"."+each.charAt(each.lastIndexOf(" ")+1));//Only initial for first and last names

        }





    }


}
