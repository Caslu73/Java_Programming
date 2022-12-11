package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");//0
        names.add("Vasyl");//1
        names.add("Sumeye");//2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

     ArrayList<String> nonDuplicates = new ArrayList<>();

        for (String each : names) {
            if(nonDuplicates.contains(each))//if the nonDuplicates new list it contains already the name(each)so then skip
                continue;
            nonDuplicates.add(each);//add every name to the new list "nonDuplicates"

        }

        names = nonDuplicates;

        System.out.println(names);
        System.out.println(nonDuplicates);//[Vasyl, Sumeye, Ali]

    }
}
