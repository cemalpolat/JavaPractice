package day10_NestedIf_Ternary;

import java.util.Scanner;

public class GradeScannerClass {
    public static void main(String[] args) {


        System.out.println("Grade giriniz");

        Scanner input = new Scanner(System.in);
        String grade = input.nextLine();
       //  System.out.println("Grade = " +  grade);

        if (grade == "A" || grade == "B" || grade == "C" || grade == "D" || grade == "F") {

            if (grade == "A") {
                System.out.println("Excellent");
            } else if (grade == "B") {
                System.out.println("Great Job");
            } else if (grade == "C") {
                System.out.println("Good");
            } else if (grade == "D") {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
              System.out.println("Invalid grade");
        }

    }
}

