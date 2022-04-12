package day10_NestedIf_Ternary;

public class GradeTernary {
    public static void main(String[] args) {
        char grade = 'A';

    String result = (grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')? (grade == 'A')? "Excellent" : (grade=='B')? ("Great Job")
     : (grade=='C')? "Good" : (grade=='D')? "Passed" : "Failed" : "Invalid grade";

        System.out.println(result);


      /*  if(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F'){

            if(grade == 'A'){
                System.out.println("Excellent");

            }else if (grade=='B'){
                System.out.println("Great Job");
            }else if(grade=='C'){
                System.out.println("Good");
            }else if (grade=='D'){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid grade");
        }


    }
}

       */



    }
}
