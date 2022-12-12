package day32_finalKeyword;

import java.time.LocalDate;

class Students{

    public final void language(){
        System.out.println("Java Programming");
    }
}

public final class FinalKeyword extends Students{

    /*
    public void language(){ //Final methods can never be overridden
        System.out.println("Python Programming");
    }

     */

    public FinalKeyword(){

    }

    public static void main(String[] args) {

       final char gender = 'M';

        System.out.println(gender);

        //gender = 'F';
        System.out.println(gender);

        System.out.println("------------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);

        //dateOfBirth =dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);

        System.out.println("------------------------------------------------");

        new Students().language();
        new FinalKeyword().language();

        System.out.println("------------------------------------------------");

        final String name = "James"; // prevent to be eligible for garbage collection "final" keyword

        //name = null; eligible for garbage collection
       // name = "Daniel";
        System.out.println(name);

    }
}
