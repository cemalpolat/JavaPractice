package day36_Inheritance.scrumTeamTask;

public class Tester extends Employee{

    public int totalTestcases;

    public void showTotalTestCases(){
        System.out.println(name + " has " + totalTestcases + " test cases");
    }

}
