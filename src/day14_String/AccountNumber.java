package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String number = scan.next();

        char a = number.charAt(0);
        int b = number.length();

        if ((a == '2' && b == 7) || (a == '5' && b == 10)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");


            // boolean c = (a == 50);
            //System.out.println(c);

            //  scan.close();


        }
    }

}