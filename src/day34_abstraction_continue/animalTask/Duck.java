package day34_abstraction_continue.animalTask;

public class Duck extends Animal{


    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+"is eating worms");
    }
}
