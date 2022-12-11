package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {

        for(int i = 1; i < 6; i++){
            System.out.println("Hello for loop "+ i);

        }


        System.out.println("--------------------------------------");

        for(int i = 0 ; i < 5; i++){
            System.out.println("Hello for loop "+i);
        }


        System.out.println("--------------------------------------");

        int j = 0;
        while (j < 5){
            System.out.println("Hello while loop "+j);
            j++;
        }
        System.out.println("--------------------------------------");

        int k = 0;
        do{ // do block will execute the block it does not matter if the condition is false, after executing will check and if the condition is false it will stop.
            System.out.println("Hello do while loop "+k);
            k++;
        }while(k < 5);

        System.out.println("--------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while(score > 100 || score < 0){ // while the score is invalid
            System.out.println("Invalid score, please re-enter your score");
            score = input.nextInt();
        }

        if(score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



        }






    }




