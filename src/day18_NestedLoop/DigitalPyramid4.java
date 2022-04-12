package day18_NestedLoop;

import java.util.Scanner;

public class DigitalPyramid4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

           System.out.print(i + " ");

                if (i != 1) {

                    int increasingSum = 0;

                    for (int k = 1; k < i ; k++) {

                       int a = increasingSum + ( i +  (num - k));

                       System.out.print(a + " ");

                       increasingSum = a - i;
                    }
                }
            System.out.println();
            }
        }

    }
