package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethods {

    public static void main(String[] args) {
        //REPLACE ALL() METHOD

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){//if name is equal to java
                names.set(i, "Python"); // set from 'i'names replace for python
            }
            
        }

         *///replace names with the regular loop method

        Collections.replaceAll(names, "Java", "Python");//replace from "names" "Java" to "Python"

        System.out.println(names);

        System.out.println("-----------------------------------------------------------");
            //FREQUENCY OF METHOD
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,50,50,50,50,60,60,50,50,70,80,90,100));

        int count = Collections.frequency(list,50);//Frequency of 50

        System.out.println(count);

        System.out.println("-----------------------------------------------------------------");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava= Collections.frequency(words, "Java");//Frequency of Java

        System.out.println(countJava);

        System.out.println("--------------------------------------------------------");
        //FOUND THE UNIQUE NUMBERS BY THE FREQUENCY
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,50,50,50,50,50,60,60,50,50,70,80,90,100));

        for (Integer each : numbers) {
            if(Collections.frequency(numbers,each)== 1){
                System.out.println(each);
            }
        }

    }
}
