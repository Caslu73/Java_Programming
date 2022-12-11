package day27_accesModifier;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    //Instance block only when you want to set Default values
/*
    {
        name = "James";
        age = 20;
    }

 */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Jose", 25);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Lucas", 30);

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }

}
