package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char [] ch = str.replace(" ","").toCharArray();//replace just to replace the empty space

        System.out.println(Arrays.toString(ch)); //[C, y, d, e, o, S, c, h, o, o, l]


        System.out.println("----------------------------------------------");

        String str2 = "Today is a great day to learn Java";

       String [] words= str2.split(" "); // split by space

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------------");
// I changed "I love Java" for the new text below
        String sentence = "Today is a great day"; // Java love I

       String [] arr = ArraysUtility.reverse(sentence.split(" ")); // [Java, love, I]

        System.out.println(Arrays.toString(arr));

        String reversedSentence = " "; //" Java love I "

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }

        System.out.println(reversedSentence);




    }




}
