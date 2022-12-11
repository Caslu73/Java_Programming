package day16_nestedLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;

        do{ // This code fragment of username and pass will be repeating while credentials are invalid

            System.out.println("Enter your username");
            u = input.next();

            System.out.println("Enter your password");
            p = input.next();

            attempt--; // everytime do block it is repeating the "attempt" value will decrease by one

            if(attempt == 0){ // if "attempt" value reach 0 it will stop the do block. it will exit the loop
                break; // Exit the loop when reach 0
            }

        }while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")) );// while credentials are invalid, the do block will continue executed again




    }


}
