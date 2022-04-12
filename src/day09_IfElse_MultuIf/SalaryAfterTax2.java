package day09_IfElse_MultuIf;

public class SalaryAfterTax2 {
    public static void main(String[] args) {

        int salary=100000;
        double salaryAfterTax;
        boolean isMarried=true;

        if (salary>=130000){
            salaryAfterTax=salary*(1-0.35);
        }
        else if (salary>=100000){
            salaryAfterTax=salary*(1-0.3);
        }
        else if (salary>=80000){
            salaryAfterTax=salary*(1-0.25);
        }
        else{
            salaryAfterTax=salary*(1-0.2);
        }

        if (isMarried){
            salaryAfterTax=salaryAfterTax+(salary*0.05);
        }

        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }
}
