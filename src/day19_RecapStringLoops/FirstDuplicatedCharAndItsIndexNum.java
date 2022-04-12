package day19_RecapStringLoops;

import java.util.Scanner;

public class FirstDuplicatedCharAndItsIndexNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();

        String ch = "";
        int num = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch1 = str.charAt(i);
            int result = 0;

            for (int j = 0; j <= str.length() - 1; j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2) {
                    result += 1;
                }
            }
            if (result >= 2) {
                ch += ch1;
                num = str.indexOf(ch1);
                break;
            }
        }
        if (ch.equals("")) {
            System.out.println("There is no duplicating character.");
        } else {
            System.out.println("The first duplicated character in your sentence is: " + ch + " and its index number is " + num);

        }
    }
}