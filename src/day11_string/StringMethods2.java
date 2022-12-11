package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {
         String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        System.out.println("------------------------");

        String word = "java";

        word = word.replace('a','e');

        System.out.println(word);

        System.out.println("------------------------");

        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replace("Java", "Python");

        System.out.println(sentence2);

        System.out.println("------------------------");
        //REPLACE THE FIRST WORD

        String sentence3 = "I love Java, Java is cool";
        sentence3 = sentence3.replaceFirst("Java", "Python");
        System.out.println(sentence3);

        System.out.println("------------------------");

        //WAY TO REPLACE THE SECOND "JAVA" BY MAKING UNIQUE.

        String sentence4 = "Java is fun, Java is cool, Java is amazing";
        sentence4 = sentence4.replaceFirst(", Java",", Python");
        System.out.println(sentence4);

        System.out.println("------------------------");
        //SUBSTRING

        String sentence5 = "I love Java Programming";

       sentence5= sentence5.substring(7, 10 + 1); // "Java"

        System.out.println(sentence5);

        System.out.println("------------------------");

        String sentence6 = "Today is Sunday, Tomorrow is Monday";
                          //0123456789
        String today = sentence6.substring(9 , 14 + 1);
        System.out.println(today);

        System.out.println("------------------------");

        String email = "CydeoSchoolJavaProgramming@yahoo.com";
                                                 //gmail
                                                //outlook etc.
        int beginning = email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);

        System.out.println("------------------------");

        String sentence7 = "I love Java programming";
      //String r1 = sentence7.substring(7, sentence7.length());
        String r1 = sentence7.substring(7);
        System.out.println(r1);

        System.out.println("------------------------");

        String sentence8 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence8.substring(sentence8.lastIndexOf(' ') + 1 );

        System.out.println(tomorrow);

        System.out.println("------------------------");
        String sentence9 = "I study at Cydeo School";

        String schoolName = sentence9.substring(11);

        System.out.println(schoolName);

        System.out.println("------------------------");
        //REPEAT METHOD
        String str = "Python";
        String result = (str + "\t").repeat(10);
        System.out.println(result);




    }
}
