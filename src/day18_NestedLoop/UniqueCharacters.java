package day18_NestedLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = scan.nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
                char ch1 = str.charAt(i);
                int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);

                if (ch1 == ch2){
                    count++;
                }
            }
            if (count == 1){
                res += ch1;
            }
        }

        System.out.println(res);


    }
}
