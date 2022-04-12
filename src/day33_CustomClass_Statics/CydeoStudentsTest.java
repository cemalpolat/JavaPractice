package day33_CustomClass_Statics;

public class CydeoStudentsTest {
    public static void main(String[] args) {

    CydeoStudent student1 = new CydeoStudent("Ali","EU8",35, 115,15,'M','B');
    CydeoStudent student2 = new CydeoStudent("Ayse","EU8",22, 116,15,'F','A');

        System.out.println(student1);
        System.out.println(student2);

       student1.study();
       student2.attendClass();

       CydeoStudent.printSchoolName();

       CydeoStudent.printProgLanguage();

        System.out.println(student1.batchNumber);

    }
}
