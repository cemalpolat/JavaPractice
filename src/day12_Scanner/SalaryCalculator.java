package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourlyRate:");
        double horlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week:");
        int weeklyHrs = scan.nextInt();

        System.out.println("Enter state tax %: ");
        double stateTax = scan.nextDouble();

        System.out.println("Enter federal tax %:");
        double federalTax = scan.nextDouble();


        double salary = (horlyRate * weeklyHrs * 52);
        double stateTaxAmount = stateTax * salary;
        double federalTaxAmount = federalTax * salary;
        double totalTax = federalTaxAmount + stateTaxAmount;
        double netIncome = salary - totalTax;





       System.out.println("salary = " + salary + "\nState tax = " + (stateTax*salary) + "\n Federal Tax + " + (federalTax*salary) + "\n Total Tax + " + totalTax + "\n Net Income + " + netIncome );


    }
}
