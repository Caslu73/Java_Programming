package day12_customMethods;

public class emailTask {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";
                      //0123456789
        String firstName = email.substring(0, email.indexOf("_"));//subtract first name
         // 0= "m" of mike, indexOf() till underScore"_" it means one space behind underscore will take it.
        String lastName = email.substring( email.indexOf("_") + 1, email.indexOf("@") );//subtract last name
         // email.indexOf()from underScore + 1 = "t" of tyson, to "@" it means one space behind @ symbol will take it.
        String rest = email.substring(email.indexOf("@")); //subtract the rest

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(rest);

        email = lastName + "_" + firstName+rest;

        System.out.println("email = " + email);



    }
}
/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */