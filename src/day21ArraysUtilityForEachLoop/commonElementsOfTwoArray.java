package day21ArraysUtilityForEachLoop;

public class commonElementsOfTwoArray {
    public static void main(String[] args) {

      int []  arr1 = {1,2,3,4,5};
      int []  arr2 = {4,5,6,7,8};

        String res = "";
        for (int ar1 : arr1) {

            for (int ar2 : arr2) {

                if (ar1 == ar2){

                    if (!res.contains("" + ar1)) {

                        res += " " + ar1;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
