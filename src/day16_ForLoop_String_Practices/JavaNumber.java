package day16_ForLoop_String_Practices;

public class JavaNumber {
    public static void main(String[] args) {
        String str = "Javabhnshjd bhdyudJava JavaJavaJava";

     String neww = str.replace("Java", "");
       int javaNumber= (str.length() - neww.length()) / 4;

        System.out.println(javaNumber);
    }
}
