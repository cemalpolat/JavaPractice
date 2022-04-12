package day19_RecapStringLoops;

import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Enter the radius of the circle:");
            int radii = scan.nextInt();

            if (radii <= 0) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            } else {
                System.out.println("Diameter of the circle is " + (2 * radii));
                System.out.println("Area of the circle is " + (radii * radii * 3.14));
                System.out.println("Perimeter of the circle is " + (2 * radii * 3.14));
            }
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();
            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("Invalid entry.Please re enter:");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                System.exit(0);
            }


           }


    }
}
