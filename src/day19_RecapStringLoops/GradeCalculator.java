package day19_RecapStringLoops;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your score:");
            int score = scan.nextInt();

            if (score > 100 || score < 0) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
            System.out.println("Would you like to continue");
            String answer = scan.next();

            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {

                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }


        }
    }
}
