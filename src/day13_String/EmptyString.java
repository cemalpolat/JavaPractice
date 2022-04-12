package day13_String;

import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.nextLine();

     if ( word.length()==0){
         System.out.println("String is empty");
     }else if(word.length()<=3){
         System.out.println(word);
     }else{
         System.out.println(""+ word.charAt(word.length()-3)+
        word.charAt(word.length()-2) + word.charAt(word.length()-1));
     }
    scan.close();
    }
}
