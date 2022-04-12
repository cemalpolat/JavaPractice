package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    while (true) {
        System.out.println("Enter the first number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter the math operator:");
        char op = scan.next().charAt(0);

        while (!(op == '+' || op == '-' || op == '*' || op == '/')) {
            System.out.println("Invalid entry, please re enter:");
            op = scan.next().charAt(0);
        }

        System.out.println("Enter the second number:");
        double num2 = scan.nextDouble();

        double result = (op == '+') ? num1 + num2 : (op == '-') ? num1 - num2 : (op == '*') ? num1 * num2 : num1 / num2;
        System.out.println(result);

        System.out.println("Would you like to continue?");
        String answer = scan.next();

        while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {

            System.out.println("Invalid entry, please re enter:");


            answer = scan.next();
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Thanks for using Cydeo calculator!");
            break;
        }

    }
    }
}
