package day14_String;

import java.util.Scanner;

public class firstSecondCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();

        String s1 = word1.substring(1);
        String s2 = word2.substring(1);

        System.out.println(s1 + s2);

            scan.close();






    }

}
