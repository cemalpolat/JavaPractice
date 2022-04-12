package day09_IfElse_MultuIf;
import java.util.Scanner;
public class Citizens {
    public static void main(String[] args) {
            int seniorCitizens;
            int nonSeniorCitizens;
            int age;
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
            seniorCitizens=scan.nextInt();
            nonSeniorCitizens=scan.nextInt();
            System.out.println("What is new citizen's age?");
            age = scan.nextInt();

            if(age>=65){
                System.out.println("Senior Citizen\nNew seniorCitizens count " + (seniorCitizens +1) + "\nNew nonSeniorCitizens count " + nonSeniorCitizens);

            }else {
                System.out.println("Non-Senior Citizen\nNew seniorCitizens count " + seniorCitizens + "\nNew nonSeniorCitizens count " + (nonSeniorCitizens + 1));
            }



    }

}
