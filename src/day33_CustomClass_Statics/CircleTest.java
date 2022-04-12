package day33_CustomClass_Statics;

public class CircleTest {
    public static void main(String[] args) {

      Circle circle1 = new Circle(10);
      Circle circle2 = new Circle(15.5);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1.diameter);

        double n = circle1.calcPerimeter();

        System.out.println(n);

        System.out.println(circle1.calcPerimeter());

        circle1.printPi();
        circle1.calcArea();

        Circle.printPi();



    }
}
