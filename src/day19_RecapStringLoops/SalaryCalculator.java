package day19_RecapStringLoops;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("How much you make an hour?");

            int hourlyRate = scan.nextInt();

            if (hourlyRate <= 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHours = scan.nextInt();

            if (weeklyHours < 1 || weeklyHours > 144) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double stateTax = scan.nextDouble();

            if (stateTax < 0.0 || stateTax > 0.1) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            System.out.println("Gross Salary is " + (hourlyRate * weeklyHours * 52) + " £");
            System.out.println("Federal Tax is " + (hourlyRate * weeklyHours * 52 * 0.26) + " £");
            System.out.println("State Tax is " + (hourlyRate * weeklyHours * 52 * stateTax) + " £");
            System.out.println("Total Tax is " + ((hourlyRate * weeklyHours * 52 * 0.26) + (hourlyRate * weeklyHours * 52 * stateTax)) + " £");
            System.out.println(" Net Income is " + ((hourlyRate * weeklyHours * 52) - ((hourlyRate * weeklyHours * 52 * 0.26) + (hourlyRate * weeklyHours * 52 * stateTax)) + " £"));

            System.out.println("Would you like to continue?");
            String answer = scan.next();

            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                System.exit(0);
            }


        }
    }
}








