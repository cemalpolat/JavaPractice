package day15_ForLoop;

import java.util.Scanner;

public class SumOfDigsInWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                sum = sum +  word.charAt(i) - 48;
            }

        }

        System.out.println(sum);


    }
}
