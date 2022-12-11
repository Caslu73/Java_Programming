package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //30+enter

        input.nextLine(); //adding this line can provide the full name

        System.out.println("Enter your full name:");
        String FullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("FullName = " + FullName);

        input.close();
    }
}
