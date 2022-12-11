package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

    int []score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score)); // Can be assign it to a string variable

        String result = Arrays.toString(score);// converting array object to the string

        System.out.println(result);


        System.out.println("----------------------------------------------");
       //EQUALS METHOD
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};

       boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1); // TRUE

        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = { 'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2); // FALSE

        String [] s1 = {"A", "B", "C"};
        String [] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2));//FALSE

        System.out.println("----------------------------------------------");
        //SORT() METHOD

        int [] nums = { 100, 80, 90, 75, 99, 0 , 5 , 4 , 1000, 500};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums); // Calling the sort() method it will order in ascending way the numbers

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " +nums[0]);
        System.out.println("Maximum number: " +nums[nums.length - 1]);


        System.out.println("----------------------------------------------");
        //SORT METHOD WITH STRING ARRAY

        String [] b1 = {"A", "B", "C"};
        String [] b2 = {"A", "C", "B"};

        Arrays.sort(b1); //sort method ordered in ascending order, that's why the result below it is true
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1,b2)); //TRUE BECAUSE b1 and b2 they have the same element and the sort() method ordered

        String [] students = {"Lucas", "Felipa", "Jose", "Antonio", "Mariana"};

        System.out.println(Arrays.toString(students)); // [Lucas, Felipa, Jose, Antonio, Mariana]

        Arrays.sort(students); // Sort() method ordered in order the name by the alphabet order

        System.out.println(Arrays.toString(students)); // [Antonio, Felipa, Jose, Lucas, Mariana]

        System.out.println("----------------------------------------------");

        //COPYOF() METHOD

        int [] array = {10, 20, 30, 40, 50, 60, 70,};
                    //  1 , 2 , 3 , 4 , 5,   6 , 7
        int [] array2 = Arrays.copyOf(array, 4);//newLength number came from in[]array

        System.out.println(Arrays.toString(array2)); //[10, 20, 30, 40]

        System.out.println("----------------------------------------------");

        int [] n1 = {1,2,3,4,5};
        int [] n2 = { 6,7,8,9,10,11,12};

        int [] n3 = Arrays.copyOf(n1,n1.length+ n2.length);

        for (int i = 0,  j = n1.length ; i < n2.length; i++, j++) { //LOOP TO ADD THE REMAINING NUMBERS ON N3
            n3[j] = n2[i];

        }
        System.out.println(Arrays.toString(n3));//[1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]From the zero are the size of the second array "n2", but with the loop we have the remaining numbers

        System.out.println("----------------------------------------------");
        //COPY OF RANGE () METHOD

        char [] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // index  :     0,  1,   2,   3,   4,   5 ,  6

        char [] result1 = Arrays.copyOf (ch,20);//copyOf

        System.out.println(Arrays.toString(result1));

        char [] result2 = Arrays.copyOfRange(ch, 2, 4);//Excludes ending index
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(Arrays.toString(result3));

        /*
        CopyOf always copy starting from the very first element
        CopyOfRange you can specify the range of value that you want to copy, from whatever value to whatever value that you want
         */






    }


}
