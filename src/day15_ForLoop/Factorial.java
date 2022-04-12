package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        int faktorial =1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

          faktorial = i * (faktorial);

        }

        System.out.print(faktorial);



    }

}
