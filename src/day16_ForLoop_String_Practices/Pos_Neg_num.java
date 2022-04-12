package day16_ForLoop_String_Practices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pos_Neg_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = "";
        int positive = 0;
        int negative = 0;

        System.out.println("Enter five numbers:");
        int num1 = scan.nextInt();
            word += num1;
        int num2 = scan.nextInt();
            word += num2;
        int num3 = scan.nextInt();
            word += num3;
        int num4 = scan.nextInt();
            word += num4;
        int num5 = scan.nextInt();
            word += num5;


        for (int i = 0; i <5  ; i++) {
            char ch=  word.charAt(0);
         if ( ch > 0 )  {
            positive += 1;
         }
         if (ch < '0'){
             negative += 1;
         }

        }
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);

        System.out.println(word);
    }
}
