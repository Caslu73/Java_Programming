package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 2) {       //To jump, to skip
                continue;
            }

            System.out.println(i);
        }

        System.out.println("--------------------------------------------------------------");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) { // If "i" is even
                continue; // skips the current iteration
            }


            System.out.println(i);

        }
        System.out.println("--------------------------------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) { // "i" can be only one character per time> A, B, C, D, E, F, G

            if (i == 'B' || i == 'E') {

                continue;
            }
            System.out.println(i);

        }

        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");

        }

        System.out.println("--------------------------------------------------------------");
        // Find the sum of all the even number between 50 ~ 100

        //3 WAYS TO GET EVEN NUMBERS

        for(int i = 50; i < 101; i ++){ // Even numbers
            if(i %2==0){
                System.out.print(i + " ");

            }
        }
        System.out.println();
        for (int i = 50; i < 101 ; i+=2) {
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 50; i < 101 ; i++) {
            if(i % 2 != 0){ // if the i's value is odd number
                continue; // skip it

            }
            System.out.print(i+ " ");


        }
        System.out.println();
        int j = 50;
        int k = 20;
        j = j += k;
        System.out.println(j);






    }




    }









