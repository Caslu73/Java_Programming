package day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

       str1 = str1.toLowerCase(); // convert to lower case

        System.out.println(str1);

        //------------------------------------

        String str2 = "java programming";
        str2 = str2.toUpperCase(); // Convert to upper case
        System.out.println(str2);

        //------------------------------------
        String word = "Wooden Spoon";

        word = word.toUpperCase(); // "WOODEN SPOON"

        word = word.toLowerCase(); // "wooden spoon"

        System.out.println(word);

        //------------------------------------

        String str4 = "                 Cydeo school";

       str4 = str4.trim();  //"Cydeo school"

        System.out.println(str4);

        //------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Car";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a");

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4= s2.indexOf("aS");

        System.out.println(a4);

        //------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a')); //1 indexOf reads LEFT TO RIGHT

        System.out.println(w.lastIndexOf('a')); //3  lastIndexOf reads RIGHT TO LEFT

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));




    }
}
