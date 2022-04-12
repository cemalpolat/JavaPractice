package day14_String;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        int s1 = word.length();

        char a = word.charAt(s1-1);
        char b = word.charAt((s1-2));

        if(b=='l' && a=='y'){
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }


scan.close();



    }
}
