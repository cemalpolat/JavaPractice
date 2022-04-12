package day16_ForLoop_String_Practices;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char ch = scan.next().charAt(0);
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ch) {
                count++;

            }
         }
        System.out.println(count);
    }
}