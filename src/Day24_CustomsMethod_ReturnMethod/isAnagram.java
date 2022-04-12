package Day24_CustomsMethod_ReturnMethod;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {

       String str1 = "cbaa";
        String str2 = "abac";

        if(isAnagram(str1, str2)) {

            System.out.println("yupi");
        }


    }



    public static boolean isAnagram(String a, String b){

        char [] ch1 = new char[a.length()];
        char [] ch2 = new char[b.length()];

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }




}
