package Day24_CustomsMethod_ReturnMethod;

public class Palindrome {
    public static void main(String[] args) {

       // String str = "Leveli";

        System.out.println(isPalindrome("level"));



    }

    public static boolean isPalindrome(String a) {

        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {

            reverse += a.charAt(i);
        }
        return a.equalsIgnoreCase(reverse);

    }
}