package day16_ForLoop_String_Practices;

import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.next();
        System.out.println("enter a char:");
        String ch = scan.next();

     int num = 0;

        for (int i = 0; i <= str.length()-1 ; i++) {
            String ch1 = "" + str.charAt(i);
            if (ch1.equals(ch)){
                num +=1;
            }
        }
        System.out.println(num);

    }
}
