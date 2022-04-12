package day19_RecapStringLoops;

import java.util.Scanner;

public class CharsAppearTwice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            String ch1 = "" + str.charAt(i);
            int num = 0;

            for (int j = 0; j < str.length(); j++) {
                String ch2 = "" + str.charAt(j);

                if (ch1.equals(ch2)) {
                    num++;
                }
            }
            if (num == 2) {
                if (!str1.contains(ch1)) {
                    str1 += ch1 + ", ";
                }
            }
        }
        if (str1.equals("")) {
            System.out.println("There is no character appearing twice in your sentence");
        } else {
            System.out.println("The character(s) appearing twice in tour sentence is/are: " +str1);
        }
    }
}