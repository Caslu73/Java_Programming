package day28_encapsulation;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Lucas");
        Person person2 = new Person("Ruth", 'F');
        Person person3 = new Person("Jose", 25);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatiana", 25,'F');
        Person person6 = new Person("Toto",31,'M',"Spanish");

        person4.name = "James";

        //person1.planet = "Mars";
           // Person.planet = "Mars";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();

        person1.eat("Banana");
        person2.drink("water");
        person5.drink("tea");
        person6.drink("coffee");
    }
}
