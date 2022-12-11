package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student();
       // student1.age = -200;

        //System.out.println(student1.age);

      student1.setAge(28);

        System.out.println(student1.getAge());

        //student1.name = "Lucas";
        //student1.setName("Lucas");

        System.out.println(student1.getName());


    }
}
