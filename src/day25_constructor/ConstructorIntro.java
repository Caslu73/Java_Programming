package day25_constructor;

public class ConstructorIntro {

    //Constructor has to be the same name as the class

    public ConstructorIntro(){
        System.out.println("Object is created by using no argument constructor");
    }

    public ConstructorIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }


    public void add(){

    }

    public static void main(String[] args) {
        ConstructorIntro obj1 = new ConstructorIntro(10);

        ConstructorIntro obj2 = new ConstructorIntro();

        //ConstructorIntro obj3 = new ConstructorIntro("Java"); error

    }
}
