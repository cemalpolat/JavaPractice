package day31_CustomClass_Constructors;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours){

        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary (){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax(){
        double stateTax = stateTaxRate * salary();
        return stateTax;
    }

    public double federalTax(){
        double federalTax = federalTaxRate * salary();
        return federalTax;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - stateTax() - federalTax();
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary= $" + salary() +
                ", state tax= $" + stateTax() +
                ", federal tax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +
                '}';
    }

    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(15.5, 25, 1, 45);



        System.out.println(salary1);





    }
}
