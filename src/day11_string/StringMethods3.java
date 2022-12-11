package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        //==============================================

        String str = "      ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //==============================================

        String str1 = "Cydeo"; // Create in the pool
        String str2 = new String("Cydeo"); // create outside of the pool

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo"); // low character

        System.out.println(str2.equals(str3)); // false

        //==============================================

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        //==============================================

        String students = "Hasan Naran Sumeve Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);


        String sentence = "My favorite programming language is JAVA";
        boolean hasJava= sentence.toLowerCase().contains("java");//true cause added toLowerCase to che IF contains the same word.

        System.out.println("hasJava = " + hasJava);

        //==============================================

        String name = "Michael";
        boolean l = name.startsWith("Da");
        System.out.println(l);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);

        boolean t = url.endsWith(".com");
        System.out.println(t);

        //==============================================

        String email = "CydeoSchool@yahoo.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);


    }
}
