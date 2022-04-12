package day33_CustomClass_Statics;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Anadol","Poturge","White",1960,15000);
        Car car2 = new Car("Ford","Taunus","Black", 1985,12000);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.make);
        System.out.println(car2.toString());

        car1.isDriving();

    }
}
