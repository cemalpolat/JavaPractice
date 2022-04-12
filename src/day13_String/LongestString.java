package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String result = (str1.length() > str2.length())? "str1 is the longest" :
                (str2.length() > str1.length())? "str2 is the longest": "They are equal in length";

        System.out.println(result);



    }
}
