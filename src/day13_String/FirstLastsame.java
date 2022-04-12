package day13_String;

import java.util.Scanner;

public class FirstLastsame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        char f = word.charAt(0);
        char l = word.charAt(word.length()-1);

       if (f==l){
           System.out.println("Same");
       }else{
           System.out.println("Different");
       }

        scan.close();


    }
}
