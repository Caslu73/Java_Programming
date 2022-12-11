package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Lucas", 30, 'M', "Sdet", 150000, LocalDate.of(2023,8,17));

        System.out.println(e1);

    }
}
