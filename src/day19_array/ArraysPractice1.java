package day19_array;


import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {
        String[] myGroup = new String[5]; // <== quantity of the Strings, in this case are names of a group

        myGroup [0] = "Gulcin";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[2] = "Sumeve";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";

        System.out.println(Arrays.toString(myGroup));//To print the 5 names of "myGroup"

        myGroup[1] = "Kuzzat";
       // myGroup[5] = "Muhtar";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) { // REVERSE WAY shortcut is forr
            System.out.println(myGroup[i]);
            
        }

        System.out.println("--------------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            
        }




    }






}
