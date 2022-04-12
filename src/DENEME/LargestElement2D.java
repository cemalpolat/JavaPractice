package DENEME;

import java.util.Scanner;

public class LargestElement2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();

        int [][] arr = new int[rows][cols];

        int max = arr [0][0];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                arr[i][j] = scan.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
