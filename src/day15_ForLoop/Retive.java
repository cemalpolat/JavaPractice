package day15_ForLoop;

import java.util.Scanner;

public class Retive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word containing letters, digits and special characters:");
        String word = scan.next();

        String letters = "";
        String digits = "";
        String speChars = "";

        for (int i = 0; i <= word.length() - 1; i++) {

            if ((word.charAt(i) >= 97 && word.charAt(i) <= 122) || (word.charAt(i) >= 65 && word.charAt(i) <= 90)) {

                 letters = (letters + word.charAt(i)+ " ");

            }else if (word.charAt(i) >= 48 && word.charAt(i) <= 57){

              digits = (digits + word.charAt(i)+ " ");

            } else{

                speChars = (speChars + word.charAt(i)+ " ");
            }
          }

        System.out.println( "letters: " + letters + "");
        System.out.println("digits: " + digits + "");
        System.out.println("special chars: " + speChars + "");

    }
}