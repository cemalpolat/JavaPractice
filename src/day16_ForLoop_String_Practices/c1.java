package day16_ForLoop_String_Practices;

import java.util.Locale;
import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String str = "Jav";
        int count = 0;

        for (int i = 0; i <= word.length() - 3; i++) {

         if(word.substring(i, i +3).equals(str)){
             System.out.println(word.substring(i , i+3));
             count++;
         }

        }
        System.out.println(count);
    }
}