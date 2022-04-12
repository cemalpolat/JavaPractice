package week05;

import java.util.Locale;
import java.util.Scanner;

public class StringReview02 {
    public static void main(String[] args) {

        /*
        length(): doesnt take papameter it returns int
         */
        String message = "EU* is Awesome!!";
        int count = message.length();
        System.out.println("how many characters we have : " + count);
        System.out.println(count==16);
        if(message.length()==16){
            System.out.println("Happy");
        }
        System.out.println(message.toUpperCase());
        System.out.println(message); // burada eskiyi gosterir cunku daha atanmadi
        String message2 = message.toUpperCase(); // burda degisti
        System.out.println(message2);

        String str = "    abc    ";
        str= str.trim();
        System.out.println(str);

        String str2 = " abc cde ";
        str2 = str2.replaceAll(" ", "");
        System.out.println(str2);

        String str3 = " abc cde ";
        str3 = str3.replaceFirst(" ", "");
        System.out.println(str3);

        String str4 = "  EU8 Awesomw  ";
        str4= str4.trim().replaceFirst(" ", "");
        System.out.println(str4);

        // String methods chaining possible

        String str5 = "  EU8 awesome  ";
        str5 = str5.trim().replaceFirst(" ","").toUpperCase().substring(3);
        System.out.println(str5);


    }
}
