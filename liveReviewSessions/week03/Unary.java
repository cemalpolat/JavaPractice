package week03;

public class Unary {

    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 10;

        System.out.println(false | true);
        System.out.println(false || true);

        System.out.println(i2>i1 | i1>i2);

        System.out.println(i2>i1 | ++i1>i2); // ilki dogru digerine de baktigi icin i1 hafizda artik 6

        System.out.println("i1= " + i1); //  6 yapar

        System.out.println(i2>i1 | ++i1>i2); // ilki dogru digerine  bAKTIGI ICIN i1 7 oldu

        System.out.println("i1= " + i1); //  7 yapar

        boolean a = i2<i1 && ++i1<i2;  // ilki false ise digerine bakmaz i1 ayni kalir

        System.out.println("a = " + a); // false
        System.out.println("i1 = " + i1); // 7

    }
}
