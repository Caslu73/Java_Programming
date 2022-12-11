package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //FIRST EMPLOYEE OBJECT, BELOW ARE 3 DIFFERENT OBJECTS, EVERY SINGLE OBJECTS CAME FROM THE CLASS,
        //THEREFORE OBJECTS CAN NOT EXIST IF THE IS NO EMPLOYEE CLASS

        Employee employee1 = new Employee();

        employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar", 29, 'M', "Back-End Developer", 98000, "B13");

        Employee employee3= new Employee();
        employee3.setInfo("Abidullah", 30, 'M', "Front-end Developer", 99000, "C14");

        //if I Want to change the data
        employee2.age = 40;

        employee1.age= 20;
        employee3.name ="Lucy";

        //Instance method means the others objects they have their own copy of their own method
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();



    }


}
