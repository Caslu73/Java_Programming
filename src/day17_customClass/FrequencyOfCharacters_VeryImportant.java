package day17_customClass;

public class FrequencyOfCharacters_VeryImportant {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";//a2b1c3d1
                          //a b  c d
                         // 2 1  3 1
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // compare a character with every single character of the string, if it's matching with some character it will increase by one
            int count = 0 ; // count how many times the first character has appears in the string
            for (int i = 0; i < str.length(); i++) {//to get every single character of the string, index 0 to the last index number of the string
                if (str.charAt(i) == ch){//if whatever character of the string is equal to ch so than it will increase by one
                    count++;
                }

            }

            if(result.contains("" + ch)){ // if the character is already included in the result
                continue; // so than skip that character
            }

            result += ch + "" + count; // concatenate to an empty string to get string instead an integer

        }

        System.out.println(result);



    }

}
/*
Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */