package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 90;
        String result = "Your grade is: "; // By adding += im telling java to add "Your grade is: plus + A or B or C, etc.

        if(score >= 90){   // NOD NEED TO ADD && < 90 ON ELSE IF BECAUSE IS A MULTI BRANCH STATEMENT, AND IS GIVEN BY DEFAULT
            result += "A";
        }else if (score >= 80 ){ // false when the score is < 80
            result += "B";
        }else if (score >= 70 ){ // false when the score is < 70
            result += "C";
        }else if (score >= 60 ){ // false when the score is < 60
            result += "D";
        }else{
            result += "F";

        }
        System.out.println(result);

    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */
