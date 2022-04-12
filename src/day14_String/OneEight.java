package day14_String;

import java.util.Scanner;

public class OneEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();

        char a = word1.charAt(word1.length()-1);
        char b = word2.charAt(0);
        String c = word2.substring(1);
        if (a==b){
            System.out.println(word1 + c);
        }else{
            System.out.println(word1 + word2);
        }

    scan.close();

    }
}
