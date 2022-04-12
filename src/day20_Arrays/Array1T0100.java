package day20_Arrays;

import java.util.Arrays;

public class Array1T0100 {
    public static void main(String[] args) {

        int [] numbers = new int[100];

        for (int i = 0, j = 1; i < numbers.length ; i++, j ++) {

            numbers[i] = j;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}
