package day17_customClass;

public class Dog {

    public String name; // this is an instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

                //          Max,      husky,            M,        4            small        white
    public void setInfo(String name, String breed, char gender, int age, String size, String color  ){
        this.name = name;// this keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color= color;



    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }


    public String toString() { // To avoid getting hash-codes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

