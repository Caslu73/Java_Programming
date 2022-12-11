package day28_encapsulation.encapsulation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {
        if( name ==  null){
            System.err.println("Unknown");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isBlank() ){
            System.err.println("Name can not be null, blank or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0 || age > 120){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender != 'M' && gender != 'F'){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        if(dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Date of birth can't be after today's date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }

    /*
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }



    public void setDateOfBirth(LocalDate dateOfBirth) {
        //if(dateOfBirth > LocalDate.now();
        this.dateOfBirth = dateOfBirth;
    }

    */
}
/*
Variables:
name,age,gender, dateOfBirth

name:
        Write : can not be null/empty/blank
        Read : if name is null, return "Unknown" instead

age:
write: age can not be less than zero or greater than 100

gender:
write : gender can only be 'M' or 'F'


dateOfBirth:
write : can not be after today's date

Add a constructor that can set all the fields
Add toString()
 */
