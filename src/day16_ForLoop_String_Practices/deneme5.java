package day16_ForLoop_String_Practices;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String ch = scan.next();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (("" + word.charAt(i)).equals(ch)) {
                count++;

            }

        }

        System.out.print(count);
    }

}