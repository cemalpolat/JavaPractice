package day07_Practice;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6d/100d;
        double federalTaxrate = 26d/100d;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        int federalTax = (int) (salaryBeforeTax * federalTaxrate);
        int stateTax = (int) (salaryBeforeTax * stateTaxRate);
        int totalTax = stateTax + federalTax;
        int netIncome = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income is: $" + netIncome);









    }





}
