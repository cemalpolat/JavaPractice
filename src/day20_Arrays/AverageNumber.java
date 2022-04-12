package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();
        double sum = 0;
        int [] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
         }
        double average = sum / length;

        System.out.println(Arrays.toString(numbers));
        System.out.println("average = " + average);




    }
}
