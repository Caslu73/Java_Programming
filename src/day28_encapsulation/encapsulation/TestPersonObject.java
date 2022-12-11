package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Lucas", 30, 'M', LocalDate.of(1992,3,2));

        System.out.println(person1);



        System.out.println("=======================================");
        person1.setName("Julio");
        System.out.println(person1.getName());

        person1.setGender('M');
        System.out.println(person1.getGender());

        person1.setDateOfBirth(LocalDate.of(2010,2,4));
        System.out.println(person1.getDateOfBirth());

        System.out.println("==========================================");
        Person person2 = new Person("Vale", 1,'F',LocalDate.of(2022,12, 12));


        System.out.println(person2);




    }
}
