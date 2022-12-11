package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age: 1 ~ 120

        while( !(age >= 1 && age <=120) ) { // while the age is not valid

            System.err.println("Invalid entry, Please re-enter your age:");
            age = input.nextInt();

        }
        System.out.println("Are you a US Citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while ( !(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
            System.err.println("Invalid entry, Please re-enter");
            System.out.println("Are you a US Citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();
        }

        if(age >= 18 && yesOrNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

        input.close();





    }


}
