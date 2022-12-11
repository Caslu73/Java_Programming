package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Lucas"; // avaJ
        //        0123

        String reverse = ""; //"a"
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);

        String name = "Ermek Keneshbekovich apazov";
        String result = reverse(name);
        System.out.println(result);


    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;

    }

}





