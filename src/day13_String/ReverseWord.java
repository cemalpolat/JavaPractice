package day13_String;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a word");
        String word = scan.next();

    if (word.length()>5){
        System.out.println("Too long!");
    }else if(word.length()<5){
        System.out.println("Too short!");
    }else{
        System.out.println("" + word.charAt(4)+ word.charAt(3)+
                word.charAt(2)+word.charAt(1)+word.charAt(0));
    }


        scan.close();


    }
}
