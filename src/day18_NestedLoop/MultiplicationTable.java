package day18_NestedLoop;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
       // int sum = i;
            for (int j = 1; j < 11; j++) {

                System.out.print(i * j + "\t");
            }

            System.out.println();
        }


    }
}
