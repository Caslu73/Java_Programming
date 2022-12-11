package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        String [] arr = {"A", "B", "C", "D"};//Single Array
            //Converting to Array list
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr) );//Array list

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------");
        //Array list converting to Array
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#") );

        String [] languages = list2.toArray(new String[0]);//zero temporary number

        System.out.println(Arrays.toString(languages));

        System.out.println("---------------------------------------------");

        //Converting array list to array Integer type
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));

    }
}
