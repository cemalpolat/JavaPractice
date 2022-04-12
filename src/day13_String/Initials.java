package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:" );

        String fname = scan.next();
        String lname = scan.next();

        String str1 = fname.toUpperCase();
        String str2 = lname.toUpperCase();

        System.out.println("" + str1.charAt(0) + str2.charAt(0));

    }
}
