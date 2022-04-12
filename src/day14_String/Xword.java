package day14_String;

import java.util.Scanner;

public class Xword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        char a = word.charAt(0);

    if(a=='X' || a=='x'){
        System.out.println(word.substring(1));
    }

scan.close();


    }
}
