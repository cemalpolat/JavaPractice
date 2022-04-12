package day13_String;

import java.util.Scanner;

public class logInCydeo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        String CydeoUserName = "Cydeo";
        String CydeoPassWord = "WoodenSpoon";

        if (userName.equals(CydeoUserName) && password.equals(CydeoPassWord)){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }


    }
}
