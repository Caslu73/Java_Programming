package day29_inheritance.animalTask;

public class Cat extends Animal{//Cat is an animal


    public void meow(){
        System.out.println(getName() +" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }
}