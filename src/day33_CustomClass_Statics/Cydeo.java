package day33_CustomClass_Statics;

public class Cydeo {


    public String name, batchNumber;
    public int age, ID, groupNumber;
    public char grade, gender;

    public static String schoolName = "CYDEO", programmingLanguage = "Java";

    public Cydeo(String name, String batchNumber, int age, int ID,
                 int groupNumber, char grade, char gender) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.ID = ID;
        this.groupNumber = groupNumber;
        this.grade = grade;
        this.gender = gender;
    }

    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " is attending class");
    }
    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language is " + programmingLanguage);
    }

    public String toString() {
        return "CYDEO{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                ", gender=" + gender +
                '}';
    }
}
