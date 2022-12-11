package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // enter

        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); // Lucas Caceres + enter

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine(); // cydeo school + enter

        System.out.println("Enter your gender:");
        String gender = input.next(); // male

        System.out.println("Enter your age:");
        int age = input.nextInt(); //30

        input.nextLine();// clear out the scanner
        //we have to give extra nextLine() if we are using a nextLine() method after the other methods of scanner

        System.out.println("Enter your street name:");
        String street= input.nextLine();


    }
}
