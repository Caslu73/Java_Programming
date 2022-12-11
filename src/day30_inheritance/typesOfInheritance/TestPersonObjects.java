package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16),'A',"A01");

        President president = new President("Daniel", 'M', LocalDate.of(1980,12,11),LocalDate.of(2020,4,5));

        Teacher teacher = new Teacher("Emily",'F', LocalDate.of(1985,11,1),"Math teacher", "A01",85000);

        System.out.println(student1);
        System.out.println(teacher);
        System.out.println(president);
        System.out.println("=====================");

        student1.study();
        teacher.teach();
        president.lie();

        System.out.println("=========================");

        student1.eat("Sandwich");
        teacher.eat("kabad");
        president.eat("hot dog");

        student1.drink("water");
        teacher.drink("tea");
        president.drink("beer");




    }




    }

