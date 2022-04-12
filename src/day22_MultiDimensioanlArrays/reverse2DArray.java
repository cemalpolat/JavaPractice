package day22_MultiDimensioanlArrays;

import java.util.Arrays;

public class reverse2DArray {
    public static void main(String[] args) {

        int [][] array = { {1,2,3}, {4,5,6}};

        int [][] newArray = new int[array.length][];

        for (int i = array.length - 1, j =0 ; i >= 0; i--, j++) {

            newArray[j] = array[i];

        }

        System.out.println(Arrays.deepToString(newArray));
    }

}
