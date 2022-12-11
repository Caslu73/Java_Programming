package day28_encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman ;
    public static boolean hasNose ;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name){//allows us to create Person object by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age){//allows us to create Person object by setting the name and the age of the person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
       this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
        this(name, age, gender);
        this.language = language;
    }


    //Static Block, Static only accept statics
    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    //Methods, printPlanetName is static method
    public static void printPlanetName(){
        System.out.println("Planet name is: "+planet);
    }

    //Instance method
    public void eat(String food){
        System.out.println(name+ " is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name +" is drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", isHuman='" + isHuman + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
