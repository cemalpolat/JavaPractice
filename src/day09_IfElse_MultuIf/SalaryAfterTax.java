package day09_IfElse_MultuIf;

public class SalaryAfterTax {
    public static void main(String[] args) {

        double salary = 130000;
        double salaryAftTax = 0;
        boolean isMarried = false;

        boolean percent35 = (salary >= 130000);
        boolean percent30 = (salary < 130000 && salary >= 100000);
        boolean percent25 = (salary < 100000 && salary >= 80000);
        boolean percent20 = (salary < 80000);

        if(percent35 && isMarried){
            salaryAftTax = salary - (salary * 30/100) ;
        }else if(percent35 && !isMarried){
            salaryAftTax = salary - (salary * 35/100);
        }else if(percent30 && isMarried){
            salaryAftTax = salary - (salary * 25/100);
        }else if(percent30 && !isMarried) {
            salaryAftTax = salary - (salary * 30 / 100);
        }else if(percent25 && isMarried) {
            salaryAftTax = salary - (salary * 20 / 100);
        }else if(percent25 && !isMarried) {
            salaryAftTax = salary - (salary * 25 / 100);
        }else if(percent20 && isMarried) {
            salaryAftTax = salary - (salary * 15 / 100);
        }else if(percent20 && !isMarried){
            salaryAftTax = salary - (salary * 20 / 100);
        }
        System.out.println("Salary After Tax is: " + salaryAftTax);

    }
}
/* if (!isMarried) {

            if (salary>=130000){
                salary = salary-salary*35/100;
            }else if (salary>=100000 || salary<130000){
                salary = salary - salary*30/100;
            }else if (salary>=80 || salary<100000){
                salary = salary - salary*25/100;
            }else {
                salary = salary - salary*20/100;
            }
        }else {

            if (salary>=130000){
                salary = salary-salary*30/100;
            }else if (salary>=100000 || salary<130000){
                salary = salary - salary*25/100;
            }else if (salary>=80 || salary<100000){
                salary = salary - salary*20/100;
            }else {
                salary = salary - salary*15/100;
            }
        }
        System.out.println("isMarried = " + isMarried);
        System.out.println("salary = " + salary);
    }

 */