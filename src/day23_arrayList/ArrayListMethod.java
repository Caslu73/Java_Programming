package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {

    public static void main(String[] args) {

        int []array = {1, 2, 3, 4, 5};
         array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);//[Eggs, Paper Towels, Apples, Cooking oil]
        System.out.println("------------------------------------------");

        //Now I want to update the element Apples to Orange
//Index of groceriesList: 2 = "Apples" new element ==> "Orange"
        groceriesList.set(2,"Orange");
        System.out.println(groceriesList);//[Eggs, Paper Towels, Orange, Cooking oil]


        //it moves to the right the "Orange" now "Chicken" goes instead the index number 2
        groceriesList.add(2,"Chicken");
        System.out.println(groceriesList);//[Eggs, Paper Towels, Chicken, Orange, Cooking oil]


        //Remove method
        groceriesList.remove(0);
        System.out.println(groceriesList);//[Paper Towels, Chicken, Orange, Cooking oil]

        groceriesList.remove("Paper Towels");
        System.out.println(groceriesList);//[Chicken, Orange, Cooking oil]


        System.out.println("--------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4


        //valueOf to convert a string to a wrapper object???
        //it removes "10" from the numbers ArrayList
        boolean r1 = numbers.remove(Integer.valueOf(10));//[20, 30, 40, 50]

        System.out.println(numbers);

        System.out.println(r1);

        //Clear Method
        numbers.clear(); // it clears the whole numbers list
        System.out.println(numbers);// []
        System.out.println(numbers.size()); // 0

        System.out.println("-----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");//0
        names.add("Vasyl");//1
        names.add("Sumeye");//2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl") ); // 0
        System.out.println(names.lastIndexOf("Vasyl")); //1

        System.out.println(names.lastIndexOf("Sumeye"));//5

        //Verify if this array list has muhtar

        boolean hasMuhtar = names.contains("Muhtar");//false
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);//True

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);//false
        System.out.println(l1.equals(l2));//true

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));//false because elements are not at the same order

        //isEmpty method
        System.out.println(n1.isEmpty());//false
        System.out.println(n2.isEmpty());//false

        //Clear the n1 and n2 list, delete elements
        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());//true
        System.out.println(n2.isEmpty());//true

    }
}
