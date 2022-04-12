package day19_RecapStringLoops;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        int highestFreq = 0;


        for (int i = 0; i < sentence.length(); i++) {
            int freq = 0;
            for (int j = 0; j < sentence.length(); j++) {

                if (sentence.charAt(i) == sentence.charAt(j)){
                    freq++;
                }
            }
            if (freq > highestFreq){
                highestFreq = freq;
            }
        }

            String str = "";

        for (int i = 0; i < sentence.length() ; i++) {
            int count = 0;

            for (int j = 0; j < sentence.length(); j++) {

                if ( sentence.charAt(i) == sentence.charAt(j)){
                    count++;
                }

            }
            if ( count == highestFreq && !str.contains("" + sentence.charAt(i))){
                str +=  sentence.charAt(i) + " ";
            }
        }

        System.out.println(str);
        System.out.println(highestFreq);
    }
}
