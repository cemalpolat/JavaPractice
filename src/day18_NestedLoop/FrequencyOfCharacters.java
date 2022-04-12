package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        String res = "";

        for (int i = 0; i < sentence.length(); i++) {
            int count = 0;

            for (int j = 0; j < sentence.length(); j++) {

                if (sentence.charAt(i) == sentence.charAt(j)) {
                    count++;
                }
                }
            if (!res.contains("" + sentence.charAt(i))) {
                res += sentence.charAt(i);
                System.out.print(sentence.charAt(i) + " occurs " + count + " times in this sentence");
                System.out.println();

            }


        }

    }
}
