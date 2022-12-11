package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//index number: 0
        list.add(20);//index number: 1
        list.add(30);//index number: 2
        list.add(10);//index number: 3
        //list.add(5.5) compile error cause ArrayList it should be Integer dataType
        System.out.println(list);

        list.add(1,15);//Means "add me 15 to the index 1 of the list and the current number of index 1 move it to index 2

        System.out.println(list);

        list.add(2,25);//"add me 25 to the index 2 of the list and the current number of index 2 move it to index 3

        System.out.println(list);

        System.out.println("---------------------------------");

        //SIZE METHOD AND ADD

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add ("Mohammad");
        studentsList.add ("Lucas");
        studentsList.add ("Maggie");
        studentsList.add ("Jose");

        System.out.println(studentsList.size());//4
        System.out.println(studentsList);//[Mohammad, Lucas, Maggie, Jose]

        String secondStudent = studentsList.get(1);//Lucas

        System.out.println(secondStudent);//Lucas

        String lastStudent= studentsList.get(studentsList.size()-1);//Jose

        System.out.println(lastStudent);//Jose

    }
}
