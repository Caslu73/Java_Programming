package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //addAll method()
        //Below asking to add all the collection of the list called "numbers" to "list1" and add me from the index number 1
        list1.addAll(1,numbers);//specified in which index you want it add, in this case index 1 so then

        System.out.println(list1);// = [1, 10, 20, 30, 40, 2, 3] it shifts to the right side the remaining numbers of list1

        System.out.println("-----------------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        //asList method, add elements and returns as a list, asList create a list collection
        scores.addAll(Arrays.asList(75,85,95,70,80));//add me these elements to the list "scores"

        System.out.println(scores);

        System.out.println("---------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Lucas", "Maggie", "Norma", "Tatiana"));////add me these elements to the list "students"

        System.out.println(students);//Lucas, Maggie, Norma, Tatiana]
// add me from index 2 of the student's list the new Arrays.asList, and shift to the right the remaining names
        students.addAll(2, Arrays.asList("Jose", "Mauricio", "Evelyn"));

        System.out.println(students);//[Lucas, Maggie, Jose, Mauricio, Evelyn, Norma, Tatiana]

        System.out.println(students);

        System.out.println("----------------------------------------------------------------------------------------");

        Integer [] nums = {1,2,3,4,5,6,7,8};//this array is not a collection

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        //l1.addAll(Arrays.asList(nums)); Both ways to add the array that is not a collection
        //to the ArrayList, just make sure that the data is not primitive as "int", "double" etc

        System.out.println(l1);//[1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("--------------------------------------------------------");

        //containsAll() METHOD

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali") );

        System.out.println(employeeList);//[Alena, Muhtar, Gadir, Ali]

        //contains()method individual
        boolean hasAlena = employeeList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);//true

        //containsAll() method
        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena", "Gadir"));
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);//true

        boolean hasMuhtarAliKuzzat = employeeList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);//false

        System.out.println("--------------------------------------------------------------");
        //Remove all method
        //In order to pass multiply elements as a collection type, Used the asList method from Arrays utility class

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));

        list.removeAll(Arrays.asList(10,20));//remove all the 10 and 20

        System.out.println(list);//all the 10 and 20 being removed result = [30, 40, 50, 60, 70]

        System.out.println("---------------------------------------------------------------");

        //retainAll() it removes the elements that are not matching, is the opposite of removeAll

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena" , "Muhtar", "Gadir", "Ali", "Khashayar", "Madivar", "Muhtar", "Muhtar","Alena"));

        //retainAll() elements that are not matching are going to be removed
        developers.retainAll(Arrays.asList("Alena", "Khashayar","Muhtar"));
        System.out.println(developers);

        System.out.println("------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato","Rice","Orange","Strawberry","Blueberry", "Paper towel"));

        //Retain eggs, potato and milk
        groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk"));
        System.out.println(groceriesList);









    }

}
