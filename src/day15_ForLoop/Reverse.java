package day15_ForLoop;

public class Reverse {
    public static void main(String[] args) {

        String word = "CYDEO";
        int lim = word.length() - 1;
        String reversed = "";

        for (int i = lim; i >= 0; i--) {
            char ch = word.charAt(i);
        reversed +=  ch;

        }

        System.out.println(reversed);
        }


    }
