package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {
        //LOOP
       // for(int i=5; i <=10; i--){ infiniti loop

        for(int i = 10; i >= 5; i--){ // i: 10,9,8,7,6,5,4
            System.out.println("Hello  Cydeo " +i); // 1,2,3,4,5,6
        }

        System.out.println("=============================================================");

        //sum of all the numbers 1 ~ 100
        int sum = 0;
        /*for(int i=100; i >=1; i--){
            sum += i;

        }

         */
        for(int i=1; i <=100; i++){
            sum += i;

        }
        System.out.println(sum);
        System.out.println("=============================================================");
        //print all the character A~Z
        for(char i = 'A'; i<='Z'; i++ ){
            System.out.print(i+" "); //IT prints NO NEW LINE BECAUSE I USE PRINT STATEMENT.

        }
        System.out.println();
        System.out.println("=============================================================");

        //print all the alphabet letters in backwards
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i+" ");

        }



        }


    }

