package day13_String;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter word:");
        String word = scan.next();

        if(word.length()<3){
            System.out.println("Word is too short");

        }else if(word.length()>3){
            System.out.println("Word is too long");

        }else {
            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");

            } else {
                System.out.println("Okay word");
            }
        }


    }
}
