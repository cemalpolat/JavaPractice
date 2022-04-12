package day10_NestedIf_Ternary;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        int salary = 100000;
        int creditScore = 700;
        String result = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        salary = input.nextInt();

        System.out.println("Enter your Credit Score");
        creditScore = input.nextInt();

    result= (salary>=60000 && creditScore >= 650)? "Loan Approved" : "Load Denied";

        System.out.println(result);




    }
}
