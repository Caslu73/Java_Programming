package day34_abstraction_continue.animalTask;

public class Shark extends Animal{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shar "+getName()+ "is eating fish");
    }
}
