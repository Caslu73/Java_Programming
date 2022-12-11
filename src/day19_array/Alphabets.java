package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {
        
        char []ascending = new char[26]; // 26 letters fot the alphabets, index : 0~25
        char [] descending = new char [26];// Descending 26 letters fot the alphabets, index : 0~25.

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j;// A ~ Z. explicit casting converting number to char
            descending[i] = (char) k;// Z ~ A. explicit casting converting number to char
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("-----------------------------------------------------------");
        
        char [] characters = new char[65535]; // to get all the characters

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;

        }
        System.out.println(Arrays.toString(characters));



    }
    
}
/*
 Create a char array and store all the alphabet letters in ascending order

	4. Create a char array and store all the alphabet letters in descending order
 */