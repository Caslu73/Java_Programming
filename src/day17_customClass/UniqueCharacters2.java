package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//here I should put the index number that I want to find out the frequency
            int frequency = 0; // we dont know yet how many times will appears the character so than we put zero

            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str, loop will stop till the last index number of the str

                if (str.charAt(i) == ch) {//if the ch has appeared in the string // (i) is the index number of the every single character of the str
                    frequency++; // increase the frequency by 1
                }

            }
            if(frequency == 1){// if the frequency is equal to one, then it's unique
                unique += ch;
            }


        }

        System.out.println(unique);










    }
}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */