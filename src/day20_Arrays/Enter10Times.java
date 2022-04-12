package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Enter10Times {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] nums = new int[10];
        int max = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {

            System.out.println("Enter a number: ");
            nums[i] = scan.nextInt();

         if (nums[i] > max){
             max = nums[i];
         }
         if (nums[i] < min){
             min = nums[i];
         }
        }


        System.out.println(Arrays.toString(nums));
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
