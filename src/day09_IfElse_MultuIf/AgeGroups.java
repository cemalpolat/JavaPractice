package day09_IfElse_MultuIf;

public class AgeGroups {
    public static void main(String[] args) {

       int age = 45;

        if (age<=0){
            System.out.println("Invalid entry !!!");
        }else if (age<=2){
            System.out.println("infant");
        }else if (age<=5){
            System.out.println("Todler");
        }else if (age<=9){
            System.out.println("Kid");
        }else if (age<=12){
            System.out.println("Pre-Teen");
        }else if (age<=17) {
            System.out.println("Teenager");
        }else if (age<=20) {
            System.out.println("Young Adult");
        }else if (age<=39) {
            System.out.println("Adult");
        }else if (age<=49) {
            System.out.println("Young Middle-Aged Adult");
        }else if (age<=54) {
            System.out.println("Middle-Aged Adult");
        }else if (age<=64) {
            System.out.println("Very Young Senior Citizen");
        }else if (age<=74) {
            System.out.println("Young Senior Citizen");
        }else if (age<=84) {
            System.out.println("Senior Citizen");
        }else if (age<=85) {
            System.out.println("Old Senior Citizen");
        }




    }
}
