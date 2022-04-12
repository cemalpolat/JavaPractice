package practiseany;
import java.util.Scanner;
public class ScanKgToPound {
    public static void main(String[] args) {
      /*
        int kg = 0;

        double pounds = 0.0;
        double converted = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please give a number as a kg : ");
        kg = scan.nextInt();
        converted = kg * 2.2;
        System.out.println(kg + " kg = " + converted + " pounds");

       */
        Scanner input = new Scanner(System.in);
        System.out.print("Please give a number as a kg : ");
        int kg = input.nextInt();
        double pound = kg * 2.2;

        System.out.println(kg+ "kg = "+pound+ " pounds");

    }

}
