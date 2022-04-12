package day16_ForLoop_String_Practices;

import java.util.Scanner;

public class MultiplyWithout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int total = 0;

        if (num1 < 0 || num2 < 0){
            System.out.println("Invalid");
        }else{

            for (int i = 1; i <= num2 ; i++) {

            total += num1;

            }
        }

        System.out.println(total);




    }
}
