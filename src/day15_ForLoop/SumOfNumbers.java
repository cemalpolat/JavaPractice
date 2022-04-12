package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int res = 0;
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 1; i <= number; i ++ ){
             res = res + i;

        }

            System.out.println(res);




    }
}
