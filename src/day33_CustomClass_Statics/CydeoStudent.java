package day33_CustomClass_Statics;

public class CydeoStudent {

    public String name, batchNumber;
    public int age, id, groupNumber;
    public char gender, grade;

    public static String schoolName = "CYDEO";

    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, String batchNumber, int age, int id,
                        int groupNumber, char gender, char grade) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.id = id;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public static void printSchoolName(){
        System.out.println("School name is: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language is: " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
