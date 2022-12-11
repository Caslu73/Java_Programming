package day08_ternary_switch;

public class IfStatementAndTernariesPractice {

    public static void main(String[] args) {

          int score = 90;

          String result = "";

          if(score >= 0 && score <= 100){   //IF STATEMENT WITH NESTED IF AND MIXED WITH TERNARY

              result = (score >= 90) ? "A" :(score >=80)? "B" :(score >=70)? "C" :(score >=60)? "D" : "F";


          }else{
              result = "Invalid score";
          }

        System.out.println(result);

        System.out.println("----------------------------------------------------------------------");

        //NESTED IF EVERYTHING WITH TERNARY, NO GOOD FOR REDIBLE

          String result2  = (score >= 0 && score <= 100) ?
                  (score >= 90) ? "A" :(score >=80)? "B" :(score >=70)? "C" :(score >=60)? "D" : "F"
          :"Invalid Score";

        System.out.println(result2);








    }



}
