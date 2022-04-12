package day36_Inheritance.scrumTeamTask;

public class Employee extends Person{

    public String iD;
    public String jobTitle;
    public double salary;

    public void setInfo (String name, int age, char gender, String iD, String jobTitle, double salary) {

        setInfo(name, age, gender);
        this.iD = iD;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "  name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", iD='" + iD + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
