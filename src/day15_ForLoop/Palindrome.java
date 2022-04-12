package day15_ForLoop;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Eye";

        String reversed = "";

        for (int i = word.length()-1; i >=0; i--) {

            char ch = word.charAt(i);
            reversed += ch;
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
        System.out.println(reversed);
    }
}
