package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

       String a = email.substring(0, email.indexOf("_"));
       String b = email.substring(email.indexOf("_")+1, email.indexOf("@"));
       String c = email.substring(email.indexOf("@"));

       System.out.println(b + "_"+ a + c);


        scan.close();


    }
}
