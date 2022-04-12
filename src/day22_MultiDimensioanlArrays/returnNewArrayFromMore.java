package day22_MultiDimensioanlArrays;

import java.util.Arrays;

public class returnNewArrayFromMore {
    public static void main(String[] args) {

      int [][] array = { {1,2,3}, {4,5,6}};

      int [][] newArray = new int[array.length][];


        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {

            newArray[j] = new int [array[i].length];    // Creating reversed 1D arrays and assigning array's length

            for (int k = array[i].length - 1, l = 0; k >= 0; k--,l++) {


                newArray[j][l] = array[i][k];




            }

        }

        System.out.println(Arrays.deepToString(newArray));
    }
}
