package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {

    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String [] words= str.split(" ");

        str = "";

        for(String each : words) {
            if(!each.isEmpty()){//If the word is not empty so then add each word to the str variable
                str += each+" "; // including the space after each word
            }
        }

        str = str.trim();// remove extra spaces that are not needed it.

        System.out.println(str);


    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */
