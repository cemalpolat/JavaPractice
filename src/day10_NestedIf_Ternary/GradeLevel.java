package day10_NestedIf_Ternary;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 19;
    if(grade<=18 && grade>=1){
        if(grade<=5){
            System.out.println("Elementary School");
        }else if (grade<=8){
            System.out.println("Middle School");
        }else if (grade <=12){
            System.out.println("High School");
        }else if (grade<=16){
            System.out.println("College");
        }else{
            System.out.println("Grad School");
        }

    }else{
        System.out.println("Invalid grade");
    }



    }
}
