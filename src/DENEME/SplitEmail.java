package DENEME;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();

        if(!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")){
            System.out.println("Invalid address!");
            System.exit(0);
        }

        String [] arr = email.split("@");

        System.out.println("email Id: " + email.substring(0, email.indexOf("@")) +
                "\nemail domain: " + email.substring(email.indexOf("@")+1));


    }
}
