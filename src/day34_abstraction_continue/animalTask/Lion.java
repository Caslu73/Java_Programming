package day34_abstraction_continue.animalTask;

public class Lion extends Animal{


    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+ " is eating buffalo");
    }
}
