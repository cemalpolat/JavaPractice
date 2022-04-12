package day12_Scanner;

import java.util.Scanner;

public class convertMiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles");
        double miles = scan.nextDouble();

        double km = 1.609 * miles;

        System.out.println(miles + " miles equal to " +  km + " kilometers");



    }
}
