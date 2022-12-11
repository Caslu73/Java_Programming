package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;


public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //how much is the frequency of each character

        String str = "aaabbbbccccc"; //a3b4c5 it should be the result

        String result = "";

        for (String each : str.split("")) { //String you have to converted to a Collection type, using split method to convert it to Array

         int frequency = Collections.frequency( Arrays.asList(str.split("")), each);//Arrays.asList to convert Array to Collection
         if(!result.contains(each)){//If the result does not contain the character yet
             result += each + frequency;//so then add me that character and his frequency
         }

        }

        System.out.println(result);
    }
}
