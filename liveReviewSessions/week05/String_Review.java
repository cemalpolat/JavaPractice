package week05;

public class String_Review {
    public static void main(String[] args) {


        String str1 = "Java"; // literal way of creating;
        // string obvjecy is created in the HEAP memory. in a special place called "String Pool"
        String str2 = "Java"; // literal,but the same object no created new

        System.out.println((str1 ==str2)); // true ayni object cunku

        String str3 = new String("Java"); // bu sefer totaly new object ve heap icinde ama pool disinda
        System.out.println((str1 ==str3)); // false; str1 ve 3 farkli objectler

        // equals metot sadece value of the object i kontrol eder . ayni object mi degil mi bakmaz.
        System.out.println(str1.equals(str3));// true . deger ayni

        String str4 = new String("JAVA");
        System.out.println(str2.equalsIgnoreCase(str4));
    }
}