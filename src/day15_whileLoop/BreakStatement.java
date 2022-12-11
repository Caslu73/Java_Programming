package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        //BREAK ONLY USED FOR EXITING

        for (int i = 0; i < 10; i++) {

            if(i==6){ //If i's value reaches 6
                break;// exits the loop
            }

            System.out.println(i);

        }

        System.out.println("------------------------------------------------------");

        for(char i = 'A'; i<= 'Z'; i++){


            if(i== 'J'){
                System.out.println("Loop is terminated");
                break;
               // System.out.println("Loop is terminated"); error because is after the break

            }

            System.out.println(i);



        }

        System.out.println("------------------------------------------------------");

        for(;;){
            System.out.println("Hello");
            break ;
           // System.out.println("World");  ERROR because after the break statement
        }


    }



}
