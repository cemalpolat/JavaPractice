package day10_NestedIf_Ternary;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 155;
        String result = "";

        if (age > 0 && age <= 150) {
            if (age < 21) {
                result = "Teenager";
            } else if (age < 55 && age >= 21) {
                result = "Adult";
            } else {
                result = "Senior";
            }

        } else {
            result = "Invalid age";

        }
        System.out.println(result);

    }
}