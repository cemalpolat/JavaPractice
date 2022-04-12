package day19_RecapStringLoops;

import java.util.Scanner;

public class IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        int indNum = 0;
        String chr = "";

        for (int i = 0; i < sentence.length(); i++) {
            String ch = "" + sentence.charAt(i);

            if (sentence.lastIndexOf(ch) == sentence.indexOf(ch)) {
                indNum = sentence.indexOf(ch);
                chr += ch;
                break;
            }
        }
        if (chr.equals("")) {
            System.out.println("There is no unique character in your sentence.");

        } else {
            System.out.println("The first unique character in your sentence is: " + chr + " with the index number of " + indNum);
        }
    }
}