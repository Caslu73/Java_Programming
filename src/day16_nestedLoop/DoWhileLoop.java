package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for (;condition ;) {
            System.out.println("Hello Cydeo -- For loop");// the condition is false, it will executed zero

        }

        System.out.println("-----------------------------------------");

        while(condition){
            System.out.println("Hello Cydeo -- While loop");// the condition is false, it will executed zero
        }
        System.out.println("-----------------------------------------");
        do{
            System.out.println("Hello Cydeo -- Do while loop");
        }while (condition);


    }


}
