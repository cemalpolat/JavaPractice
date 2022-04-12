package DENEME;

import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        double[] arr = new double[size];

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println(sum / size);
    }
}
