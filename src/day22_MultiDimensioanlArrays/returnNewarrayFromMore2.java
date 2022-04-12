package day22_MultiDimensioanlArrays;

import java.util.Arrays;

public class returnNewarrayFromMore2 {
    public static void main(String[] args) {
        int [][] arr2D= {{1,2,3},{4,5,6,7},{7,8,9,10}};
        //                0       1      2
        int [][] reversed= new int[arr2D.length][];

        for (int i = arr2D.length - 1,j=0; i >= 0; i--,j++) { // i= reversed 2d
            reversed[j]=new int[arr2D[i].length];
            // System.out.println(Arrays.deepToString(reversed));// check point to see circle of arrays
            for (int k = arr2D[i].length - 1,l=0; k >= 0; k--,l++) {
                reversed[j][l]=arr2D[i][k];

            }

        }
        System.out.println(Arrays.deepToString(reversed));

    }
}
