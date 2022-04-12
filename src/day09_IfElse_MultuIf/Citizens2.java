package day09_IfElse_MultuIf;
import java.util.*;
public class Citizens2 {
    public static void main(String[] args) {
        int seniorCitizens, nonSeniorCitizens, age ;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = keyboard.nextInt();
        nonSeniorCitizens = keyboard.nextInt();
        System.out.println("What is new citizen's age?");
        age = keyboard.nextInt();
        if (age >= 65){System.out.println("Senior Citizen");
            seniorCitizens++;}
        else{System.out.println("Non-Senior Citizen");
            nonSeniorCitizens++ ;}
        System.out.println("New seniorCitizens count "+ seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);



    }
}
