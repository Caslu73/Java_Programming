package day27_accesModifier;

public class Circle {


        public double radius, diameter;

        public static double pi = 3.14;


    public Circle(double radius) {
        this.radius = radius;
        diameter = radius *2; // not using "this" keyboard because we don't have a local variable with the same name of "diameter"
    }

    //STATIC ONLY accept statics
   /* public static double calcArea(){
        return  radius * radius * pi;
    }

    */

    public double calcArea(){
        return radius * radius * pi;

    }

    public double calcPerimeter(){

        return 2 * radius * pi;
    }

    public static void printPiValue(){
        System.out.println("PI ' value is: "+ pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea()+
                ", perimeter=" + calcPerimeter()+
                '}';
    }
}
/*
Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when
			the object of circle is passed in the print statement



 */