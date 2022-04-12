package day10_NestedIf_Ternary;

public class GradeLevelTernary {
    public static void main(String[] args) {
        byte grade = 19;
       String result =  (grade<=18 && grade>=1)? (grade<=5)?"Elementary School" : (grade<=8)?"Middle School"
        :(grade <=12)?"High School" : (grade<=16)?"College" :"Grad School" :"Invalid grade";

        System.out.println(result);

    }
}
