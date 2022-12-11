package day26_statics.studentTask;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Lucas");
        System.out.println(employee1);

        System.out.println("===========================");

        Employee employee2 = new Employee("Jose", "Sdet");
        System.out.println(employee2);

        System.out.println("===========================");

        Employee employee3 = new Employee("Victor", 'M',"Software Developer");
        System.out.println(employee3);

        System.out.println("===========================");

        Employee employee4 = new Employee("Martin", 'M', "Designer", 80000);
        System.out.println(employee4);

        System.out.println("-==============================");

        Employee employee5 = new Employee("Ruth", 'F');
        System.out.println(employee5);


    }
}
