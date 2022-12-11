package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {
            //SINGLE DIMENSIONAL ARRAY
        String [] group1 = {"Blanca", "Daniel", "Laim", " Jose"};//4 names
        String [] group2 = {"Muthar", "Rafa", "Manuel"};// 3 names
        String [] group3 = {"Baris", "julia", "Sarah", "Meli", "Moni"};// 5 names
        String [] group4 = {"Lucas","Maggie"};// 2 names

        String[][] groups =               {group1, group2, group3, group4};
        //   this "i" is the index Numbers  0        1        2         3
        for (int i = 0; i < groups.length; i++) {
            String [] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);


            }

        }

        System.out.println("--------------------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
                
            }
        }

        System.out.println("----------------------------------------");
        
        //print each array (each group) in reverse order, from index 3 to index 0

        for (int i = groups.length - 1; i >= 0; i--) {
            String [] eachGroup= groups[i]; // each single dimensional array "groups[i]
            System.out.println(Arrays.toString(eachGroup));

            //To print each names of every students
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }

        }

        System.out.println("----------------------------------------");
        System.out.println(groups); // HASHCODE

        System.out.println(Arrays.toString(groups));//HASHCODE- toString() == > for single dimensional arrays ONLY

        System.out.println(Arrays.deepToString(groups));//deeptoString() == > for multi dimensional arrays ONLY
    }
}
