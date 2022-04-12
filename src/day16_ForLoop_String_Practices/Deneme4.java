package day16_ForLoop_String_Practices;

import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.next();
        String result = "";

        for (int i = 0; i <= word1.length()-1; i++) {

            result = result +   word1.charAt(i)+ word2.charAt(i);

        }

            System.out.println(result);

    }
}
