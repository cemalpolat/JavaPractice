package day10_NestedIf_Ternary;

import java.util.Scanner;

public class AgeGroupsTernary {
    public static void main(String[] args) {
        int age = 155;
        String result = "";


        System.out.println("Yas giriniz");

        Scanner input = new Scanner(System.in);
        age = input.nextInt();


        result = (age > 0 && age <= 150)?(age < 21)? "Teenager":(age < 55 && age >= 21)?

                "Adult" :"Senior":"Invalid age";

           System.out.println(result);






            }
}
