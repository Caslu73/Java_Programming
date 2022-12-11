package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch= input.next().charAt(0);     //charAt(0); for char character



        //System.out.println("You have entered: "+ch);

        System.out.println("Would you like to continue?");
        String answer = input.next(); // EX: I don't know ==> answer I
        //String answer = input.nextLine(); //EX: I don't know ==> answer I don't know

        System.out.println("You have entered: " +answer);

        input.close();

    }
}
