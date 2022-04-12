package day21ArraysUtilityForEachLoop;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {

        int [] arr1 = {30, 10, 20};
        int [] arr2 = {15, 40, 25, 35};
        int [] arr3 = {8, 9, 17, 5, 4, 1};

        int [] arrayLast = new int[arr1.length + arr2.length + arr3.length];

        int j = 0;
        for (int i : arr1) {
            arrayLast[j++] = i;
        }

        int k = arr1.length;
        for (int x : arr2) {

            arrayLast[k++] = x;
        }

        int l = arr1.length + arr2.length;

        for (int y : arr3) {

            arrayLast[l++] = y;

        }

        System.out.println(Arrays.toString(arrayLast));
    }
}
