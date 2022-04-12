package day09_IfElse_MultuIf;

public class FINRA {
    public static void main(String[] args) {

        int num = 12;
        if(num%3==0 && num%5!=0 && num%15!=0){
            System.out.println("FIN");
        }else if(num%3!=0 && num%5==0 && num%15!=0) {
            System.out.println("RA");
        }else if (num%3==0 && num%5==0 && num%15==0) {
            System.out.println("FINRA");
        }else{
            System.out.println("none of them");
        }

      //  System.out.println(12%3);
    }
}
