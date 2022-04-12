package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array100To1 {
    public static void main(String[] args) {

        int [] numbers = new int[100];


        for (int i = 0, j = 100; i < 100; i++, j--) {
           numbers[i]= j;
           System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }


}
