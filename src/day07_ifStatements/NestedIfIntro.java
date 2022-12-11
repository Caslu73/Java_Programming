package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 101;

        if (score >= 0 && score <= 100) { //IF the score is valid will execute the next If statement

            if (score >= 60) { // If the score is greater or equal to 60
                System.out.println("Passed");

            } else { // If the score is less than 60
                System.out.println("Failed");
            }

        } else { // IF the SCORE is not valid between 0 ~ 100
            System.out.println("Invalid Score");

        }

        System.out.println("------------------------------------------------------");

        int age = 121; // 1 ~ 100

        if(age >= 1 && age <= 150){

            if(age >= 21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not eligible to buy alcohol");
            }


        }else{
            System.out.println("Invalid age");
        }

        System.out.println("------------------------------------------------------");

        int day = 1;

        if(day >= 1 && day <= 7){ // PRE CONDITION NESTED IF

            if(day == 1){
                System.out.println("Monday");
            }else if (day == 2){
                System.out.println("Tuesday");
            }else if (day == 3){
                System.out.println("Wednesday");
            }else if (day == 4){
                System.out.println("Thursday");
            }else if (day == 5){
                System.out.println("Friday");
            }else if (day == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{ //If the precondition is failed
            System.out.println("Invalid day");
        }




    }

}
