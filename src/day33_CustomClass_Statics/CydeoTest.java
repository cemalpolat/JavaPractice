package day33_CustomClass_Statics;

public class CydeoTest {
    public static void main(String[] args) {

       Cydeo student1 = new Cydeo("Ali","EU",
               35, 115,15,'A', 'M' );

        Cydeo student2 = new Cydeo("Aliye","EU",
                35, 115,15,'A', 'F' );


        System.out.println(student1);
        System.out.println(student2);

        student1.study();
        System.out.println(student1.groupNumber);


        student1.printSchoolName();
        System.out.println(student1.schoolName);

    }
}
