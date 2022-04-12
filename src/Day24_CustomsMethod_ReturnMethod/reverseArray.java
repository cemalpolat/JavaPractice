package Day24_CustomsMethod_ReturnMethod;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {10, 2, 3, 40};

        System.out.println(Arrays.toString(reversedArray(arr)));

    }

    public static int[] reversedArray(int[]array){

        int [] reversed = new int[array.length];

        int j = array.length-1;
        for (int i : array) {

            reversed [j--] = i;
        }
        return reversed;
    }
}
