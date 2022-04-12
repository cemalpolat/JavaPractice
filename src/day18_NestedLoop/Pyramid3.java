package day18_NestedLoop;

public class Pyramid3 {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11 -i ; j++) {

                System.out.print("   ");
            }

            for (int k = 1; k < i + 1 ; k++) {

                System.out.print( "*  ");
            }

            System.out.println();

        }

    }
}
