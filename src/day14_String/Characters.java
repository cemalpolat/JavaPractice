package day14_String;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

    char a = word.charAt(0);

   if(a>=48 && a<=57){ // '0'  && '9' kullanabilirdin
        System.out.println("first character is digit");
    }else if(a>=65 && a<=90){  // 'a' && 'z' kullanabilirdin
        System.out.println("first character is uppercase letter");
    }else if(a>=97 && a<=122){  // 'A' && 'Z' kullanabilirdin
        System.out.println("first character is lowercase letter");
    }else{
        System.out.println("first character is special character");
    }


        scan.close();







    }
}
