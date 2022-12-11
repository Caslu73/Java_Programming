package day19_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 85;
        int score3 = 85;
        int score4 = 85;
        int score5 = 85;

        System.out.println("---------------------------------");

        int[] scores = new int [5]; // index : 0 ~ 4 // now this is eligible for garbage collection
        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4]= 95;

        // scores[5]= 100;
       // scores[-1]= 65;
        // scores = new int [10]; // index: 0 ~ 9 // new array object,. Now this is eligible for garbage collection
        //   scores = new int[50]; // index : 0 ~ 49 // new array object

        System.out.println( Arrays.toString(scores) );

        System.out.println(scores[2]);

        System.out.println("----------------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i ; index numbers of scores array
            System.out.println(scores[i]);

        }
        System.out.println("----------------------------------------------");
        System.out.println(scores[scores.length - 1]); // to print the last index number only

    }
}
