package day18_NestedLoop;

public class DigitalPyramid3 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= (2 * i) - 2 ; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= 6-i ; k++) {

                System.out.print(k + " ");
            }
            System.out.println();
        }



    }
}
