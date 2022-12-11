package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {
/*
Parse method : returns primitive type, converts String to primitive values
valueOf method : returns wrappers class objects, converts String to wrapper class values

 */
        String str = "20";

        System.out.println(str + 1);

       // Integer num1 = Integer.parseInt(str); // parse to convert string to integer// unboxing

        int num = Integer.parseInt(str);
        System.out.println(num + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-------------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);//STRING TO PRIMITIVE

        Double num4 = Double.valueOf(s);//STRING TO WRAPPER

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("-----------------------------------");
        String x = "true";

        boolean r1 =Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("-----------------------------------------------");

        //Methods of the Character class
        //found if the character is digit

        char ch = '@';

       boolean isDigit= Character.isDigit(ch);//if the given character is digit

        boolean isLetter= Character.isLetter(ch);//if the given character is Letter

        boolean isLowerCaseLetter = Character.isLowerCase(ch);//if the given character is LowerCase

        boolean isUpperCaseLetter = Character.isUpperCase(ch);////if the given character is UpperCase

        boolean isSpecialChar = !Character.isLetterOrDigit(ch);//if the given character is "NOT LETTER OR NOT DIGIT"


        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("--------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {//each character of the string
            if(Character.isDigit(each)){
             sum +=   Integer.parseInt(""+each); //convert char to string
            }

        }
        System.out.println(sum);



    }
}
