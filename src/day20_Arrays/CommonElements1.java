package day20_Arrays;

public class CommonElements1 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {3, 4, 5, 6, 7, 8};
        String result = "";

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {

                    if (!result.contains(String.valueOf(array1[i]))) {
                        result += array1[i] + " ";
                    }

                }

            }
        }
        System.out.println(result);
    }
}
