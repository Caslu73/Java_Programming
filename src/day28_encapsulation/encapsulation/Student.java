package day28_encapsulation.encapsulation;

public class Student {


    private String name;
    private int age;

    public String getName() {

        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false, hasSpecialChar = false;

        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                hasDigit = true;
                break;
            }
        }

        if(hasDigit){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    //Getter method, READ DATA ONLY
    public int getAge(){//Getter method, THIS IS FOR READ ONLY

        if(age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    //SETTER METHOD TO WRITE ONLY
    public void setAge(int age){//WRITE ONLY

        if(age < 1 || age > 100){//if age is invalid
            System.err.println("Invalid age: "+age);
           // return;//exiting the method
            System.exit(1); // program gets terminated
        }
        this.age = age;
    }

}
