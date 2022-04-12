package day09_IfElse_MultuIf;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cents;

        System.out.println("Enter cents:");
        cents=scan.nextInt();
        boolean result = 0>=cents || cents>=100;

        if(result){
            System.out.println("Invalid cents amount");
      }else {
            int quarters = cents / 25,
                    dimes = (cents % 25) /10,
                    nickels = (cents % 25 % 10) / 5,
                    pennies = cents % 5;

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");


        }
    }



}
