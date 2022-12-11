package day17_customClass;

public class Employee {

    public String name; //Instance variable because each object they need to have separate copy of for the name
    public int age;             //6 Instance Variables, 6 Attributes
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

    //3 INSTANCE METHODS

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;   //THIS METHOD SETS ALL THE ATTRIBUTES OF THE EMPLOYEE OBJECT AT ONCE
        this.salary = salary;
        this.id = id;
    }//INSTANCE METHOD WORK SEPARATELY

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +    //THIS METHOD IT IS TO AVOID GETTING HASH CODE WHEN WE PRINT EMPLOYEE OBJECT
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){ //If the method is static I am not able to call it, thats why is instance
        System.out.println(name + " is working");

        //WHENEVER THIS WORK METHOD IT IS CALLED FROM THE EMPLOYEE OBJECT IT IS GOING TO DISPLAY THE NAME OF THAT EMPLOYEE ONLY

    }


}
