package DENEME;

import java.util.Scanner;

public class FindMinMaxSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];

        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);




    }
}

