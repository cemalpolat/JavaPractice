package practiseany;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int num1 = input.nextInt(); //

        System.out.println("Enter a decimal number:");
        double num2 = input.nextDouble();

        input.nextLine();

        System.out.println("Enter a word:");
        String word = input.nextLine();


        System.out.println("Enter a word2:");
        String word2 = input.nextLine();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);



    }




}
