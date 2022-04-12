package DENEME;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int [] reverse = new int[arr.length];

        for (int i = arr.length - 1, j =0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
