package day21ArraysUtilityForEachLoop;

import java.util.Arrays;

public class day21ArraysUtilityForEachLoop {
    public static void main(String[] args) {

        int [] numbers = {1,2,8,6,7,9,5};

        Arrays.sort(numbers);

        int [] reversedArray = new int[7];

        for (int i = reversedArray.length - 1, j =0; i >= 0; i--, j++) {

            reversedArray[j] = numbers[i];

        }


        System.out.println(Arrays.toString(reversedArray));



    }
}
