package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";//"aehtr" sort both string and ordered in ascending order by the alphabetic order
        String str2 = "earth";// "aehtr"

        //TWO WAYS TO GET EACH CHARACTER
        //String [] a1 = str1.split("");

        char [] a1 = str1.toCharArray();
        char [] a2 = str2.toCharArray();

      //  System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));

        Arrays.sort(a1);
        Arrays.sort(a2);

        //System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));

        boolean isAnagram = Arrays.equals(a1, a2);

        System.out.println("isAnagram = " + isAnagram);


    }
}
/*
2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false


        listen  sildent
 */
