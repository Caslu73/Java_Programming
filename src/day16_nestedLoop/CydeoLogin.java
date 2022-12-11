package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if the credentials are valid, are correct
            System.out.println("Logged in");
        } else {//otherwise it will check

            for (int i = 0; i < 3; i++){// 3 Times will ask the user to enter username and password if is not correct.
                /*if(i !=2) { // if the i's value don't reach 2 print "Incorrect username and pass"
                    System.err.println("Incorrect username or password, please re-enter");
                }else{ // if the i's value REACH 2 give a last warning " This is your last chance
                    System.err.println("This is your last chance, please re-enter username and password");

                 */
                System.err.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break; // then the break statement it is going to exit the loop
                }



            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) { // after all 3 attempts, if the username and pass are still incorrect
                System.err.println("Your account now is locked, please contact with the support team");
            }

        }

        input.close();
    }

    public static void Cydeologin(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.err.println("Invalid credentials");

            }
        }
    }


/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in
function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is locked."
 */