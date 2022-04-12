package day10_NestedIf_Ternary;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        int n3 = 20;

        String result = ((n1 > n2 && n1 > n3) || (n2 > n1 && n2 > n3) || (n3 > n1 && n3 > n2))?
        (n1 > n2 && n1 > n3) ?  n1 + " is bigger" : (n2 > n1 && n2 > n3) ? n2 +
                " is bigger" : n3+ " is bigger" :"No bigger";


        System.out.println(result);

    /*    if ((n1 > n2 && n1 > n3) || (n2 > n1 && n2 > n3) || (n3 > n1 && n3 > n2)) {

            if (n1 > n2 && n1 > n3) {
                System.out.println("n1 is biggest");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println("n2 is biggest");
            } else {
                System.out.println("n3 is biggest");
            }
        } else {
            System.out.println("No biggest number");

        }*/
    }

}

