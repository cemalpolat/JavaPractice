package day10_NestedIf_Ternary;

 import java.util.Scanner;

public class AgeGroupScanner {
    public static void main(String[] args) {
        int age = 1 ;
        String result = "";


        System.out.println("Enter age");

       Scanner input = new Scanner(System.in);
        age = input.nextInt();


        if (age > 0 && age <= 150) {
            if (age < 21) {
                result = "Teenager";
            } else if (age < 55 && age >= 21) {
                result = "Adult";
            } else {
                result = "Senior";
            }

        } else {
            result = "Invalid age";

        }
        System.out.println(result);

    }
}
