package day23_CustomsMethod_Void;

public class Method1To100Odd {
    public static void main(String[] args) {

        odd1To100();

    }

    public static void odd1To100() {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
