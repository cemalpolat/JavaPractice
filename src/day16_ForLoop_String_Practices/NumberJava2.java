package day16_ForLoop_String_Practices;

public class NumberJava2 {
    public static void main(String[] args) {
        String str = "Javabhnshjd bhdyudJava JavaJavaJavaJava";
        int rep = str.length()/4;
        int num = 0;

        for (int i = 1; i <= rep; i++) {

            if (str.contains("Java")) {
                num += 1;
                str = str.replaceFirst("Java", "");

            }
        }


        System.out.println(num);







    }
}