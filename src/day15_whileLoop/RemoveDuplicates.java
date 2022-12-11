package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = ""; // to store the "abc"

        for (int i = 0; i < str.length(); i++) { // i : represents the index numbers of str

            char each = str.charAt(i); //  to get each character of the String str

            if(!result.contains("" +each)){ // if the String result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
            //If the character is not contained yet in the new string, then we will add it to the new string


        }

        System.out.println(result);



    }


}
/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */