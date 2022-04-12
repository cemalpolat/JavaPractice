package DENEME;

import java.util.Arrays;
import java.util.Scanner;

public class FindMAxMinSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));

    }
}
