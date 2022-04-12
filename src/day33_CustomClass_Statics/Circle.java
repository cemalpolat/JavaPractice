package day33_CustomClass_Statics;

public class Circle {

    public double radius, diameter;
    public static double Pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea(){
        return radius * radius * Pi;
    }
    public double calcPerimeter(){
        return  radius * 2 * Pi;
    }

    public static void printPi(){
        System.out.println(Pi);
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", diameter = " + diameter +
                ", Pi = " + Pi +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}
