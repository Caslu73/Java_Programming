package day28_encapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {


      /*  Employee employee1 = new Employee();
        //employee1.salary = -20000;

        employee1.setSalary(100000);

        //In order to print salary, get we should use
        System.out.println(employee1.getSalary());

       // employee1.setName("   ");

        System.out.println(employee1.getName());

       */

        Employee employee1 = new Employee("Lucas", 120000, "SDET", 30);


        System.out.println(employee1);



    }
}
