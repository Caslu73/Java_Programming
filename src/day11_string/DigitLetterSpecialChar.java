package day11_string;
import java.util.Scanner;
public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine(); // Means to use it only one time it close automatically.

        if(str.length() >= 1){ // if the string has at least one character

            char firstCH = str.charAt(0);// The first character of the string

            if(firstCH >= '0' && firstCH <= '9'){
                System.out.println("first character is digit");
            }else if (firstCH >= 'A' && firstCH <= 'Z'){
                System.out.println("first character is uppercase letter");
            }else if (firstCH >= 'a' && firstCH <= 'z'){
                System.out.println("first character is lower letter");
            }else{
                System.out.println("first character is special character");
            }







            }else{ // If the string is empty
            System.out.println("String is empty");
        }



    }
}

/*
Create a class named DigitLetterSpecialChar and wirte a program that can ask
the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character
	        is lowercase letter"
	        - if the word starts with lowercase letters, print "first character
	        is uppercase letter"
	        - if the word starts with special characters, print "first character
	        is special character"


        	HINT: You need to check the ascii table
 */
