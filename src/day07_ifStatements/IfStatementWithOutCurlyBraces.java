package day07_ifStatements;

public class IfStatementWithOutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("----------------------------------------------");

        if (age >= 21) System.out.println("Eligible"); // ONLY possible with out curly braces when there is only one statement
        else System.out.println("Not eligible");// ONLY possible with out curly braces when there is only one statement

        System.out.println("----------------------------------------------");

        int itemNum = 1;


       /*
       if(itemNum == 1) WITH OUT CURLY BRACES IT WILL GIVE ERROR ALWAYS WHENEVER THERE IS MORE THAN ONE IF STATEMENT
            System.out.println("Eggs");
            System.out.println("Orange");
        else if (itemNum == 2)
            System.out.println("Milk");
            System.out.println("Onion");
        else
            System.out.println("Apple");
            System.out.println("Cherry");
        }

        */


        //IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE
        //if statement without curly braces:
        //            without the curly braces the blocks of if statement can only have one statement in its body

        int day = 5;  // 1 ~ 7

        if(day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");



    }
}
