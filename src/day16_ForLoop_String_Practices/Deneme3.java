package day16_ForLoop_String_Practices;

import java.util.Scanner;

public class Deneme3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int count = 0;
        String check = "aeiou";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
          //  String ch = "" + word.charAt(i);
            if (check.contains("" + word.charAt(i))) {
                count++;
                result += word.charAt(i);

            }
        }
        System.out.println(result);
        System.out.println(count);
        }

}
