package day27_accesModifier;

public class TestCircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(5);
        System.out.println(circle2);

        Circle circle3 = new Circle(7);
        System.out.println(circle3);
        /*
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);

         */
        //Correct way to call the static method, calling through the class name
        System.out.println(Circle.pi);
        //System.out.println(Circle.radius);


    }
}
